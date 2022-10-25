package com.emma_ea.pokedex_kmm.api

import com.emma_ea.pokedex_kmm.core.Constants
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

abstract class Network {

    private val jsonConfig = Json {
        isLenient = true
        prettyPrint = true
        ignoreUnknownKeys = true
    }

    val client = HttpClient(CIO) {
        expectSuccess = true
        install(ContentNegotiation) {
            json(jsonConfig)
        }

        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    Napier.v(message, null, Constants.REQUEST_TAG)
                }
            }
        }
    }.also { Napier.base(DebugAntilog()) }

    fun HttpRequestBuilder.apiUrl(base: String) {
        url {
            takeFrom(Url(base))
        }
    }

}
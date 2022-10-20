package com.emma_ea.pokedex_kmm.data.datasources.network

import com.emma_ea.pokedex_kmm.models.PokemonModel
import com.emma_ea.pokedex_kmm.models.Pokemons
import com.emma_ea.pokedex_kmm.core.constants.AppConstants
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class PokemonRDSImpl : PokemonRDS {

    private val POKEMON_ENDPOINT = "pokemon/"
    private val allPokemons = mutableListOf<PokemonModel>()

    private val client = HttpClient(CIO) {
        expectSuccess = true
        install(ContentNegotiation) {
            json(Json)
        }
        install(Logging) {
            logger = object : Logger {
                override fun log(message: String) {
                    Napier.v(message, null, AppConstants.REQUEST_TAG)
                }
            }
        }
    }.also { Napier.base(DebugAntilog()) }

    override suspend fun pokemons(): List<PokemonModel> {
        try {
            val responseList = client.request(AppConstants.BASE_API) { url { path(POKEMON_ENDPOINT) } }
            if (responseList.status.value in 200..209) {
                val data = responseList.body<Pokemons>()
                print(data.results)
                data.results.forEach {
                    allPokemons.add(getPokemonModel(it.url))
                }
            }
            return allPokemons
        } catch (cause: Throwable) {
            Napier.e(cause, AppConstants.REQUEST_TAG) { cause.message!! }
        }
        return allPokemons
    }

    override suspend fun fetchNextBatch(): List<PokemonModel> {
        return emptyList()
    }

    private suspend fun getPokemonModel(modelUrl: String): PokemonModel {
        return client.request(modelUrl).body()
    }

}
package com.emma_ea.pokedex_kmm.data.network

import com.emma_ea.pokedex_kmm.api.PokedexApi
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.api.dto.Pokemons
import com.emma_ea.pokedex_kmm.core.Constants
import com.emma_ea.pokedex_kmm.core.DispatcherProvider
import com.emma_ea.pokedex_kmm.model.Pokemon
import io.github.aakira.napier.Napier
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.withContext

class PokemonRDSImpl(
    private  val api: PokedexApi,
    private val dispatcherProvider: DispatcherProvider
) : PokemonRDS {

    private val allPokemons = mutableListOf<Pokemon>()

    override suspend fun allPokemons(): List<Pokemon> {
//        try {
//            val responseList = client.get(Constants.BASE_API + POKEMON_ENDPOINT) // { url { path(POKEMON_ENDPOINT) } }
//            if (responseList.status.value in 200..209) {
//                val data = responseList.body<Pokemons>()
//                print(data.results)
//                data.results.forEach {
//                    allPokemons.add(getPokemonModel(it.url))
//                }
//            }
//            return allPokemons
//        } catch (cause: Throwable) {
//            Napier.e(cause, Constants.REQUEST_TAG) { cause.message!! }
//        }

        withContext(dispatcherProvider.io) {
            val data = api.getPokemons()

            data.results.forEach {
                val res = getPokemonModel(it.url)
                val pokemon = Pokemon(res.id, res.name)
                allPokemons.add(pokemon)
                print(pokemon)
            }
        }

        return allPokemons
    }

    override suspend fun fetchNextBatch(): List<Pokemon> {
        return emptyList()
    }

    private suspend fun getPokemonModel(modelUrl: String): PokemonModel {
        return api.getPokemonDetail(modelUrl)
    }

}
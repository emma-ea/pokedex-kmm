package com.emma_ea.pokedex_kmm.api

import com.emma_ea.pokedex_kmm.core.Constants
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.api.dto.Pokemons
import io.ktor.client.call.*
import io.ktor.client.request.*

class PokedexApi : Network() {

    suspend fun getPokemons(): Pokemons =
        client.get {
            apiUrl(Constants.BASE_API+Constants.POKEMON_ENDPOINT)
        }.body()

    suspend fun getPokemonDetail(url: String): PokemonModel =
        client.get {
            apiUrl(url)
        }.body()

}
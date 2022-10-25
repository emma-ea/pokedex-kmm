package com.emma_ea.pokedex_kmm.repository

import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon

interface Repository {

    // network
    suspend fun allPokemons(): List<Pokemon>

    suspend fun fetchNextBatch(): List<Pokemon>

    //TODO: cache

    suspend fun allFavorites(): List<Pokemon>

    suspend fun cacheFavorite(pokemon: Pokemon): Int

    suspend fun removeFavorite(Pokemon: Pokemon): Int

}
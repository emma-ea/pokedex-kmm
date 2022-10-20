package com.emma_ea.pokedex_kmm.repo

import com.emma_ea.pokedex_kmm.models.PokemonModel

interface Repository {

    // network
    suspend fun pokemonModels(): List<PokemonModel>

    suspend fun fetchNextBatch(): List<PokemonModel>

    //TODO: cache

    suspend fun allFavorites(): List<PokemonModel>

    suspend fun cacheFavorite(pokemon: PokemonModel): Int

    suspend fun removeFavorite(Pokemon: PokemonModel): Int

}
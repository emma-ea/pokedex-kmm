package com.emma_ea.pokedex_kmm.data.datasources.network

import com.emma_ea.pokedex_kmm.models.PokemonModel

interface PokemonRDS {

    suspend fun pokemons(): List<PokemonModel>

    suspend fun fetchNextBatch(): List<PokemonModel>

}
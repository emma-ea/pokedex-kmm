package com.emma_ea.pokedex_kmm.data.network

import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon

interface PokemonRDS {

    suspend fun allPokemons(): List<Pokemon>

    suspend fun fetchNextBatch(): List<Pokemon>

}
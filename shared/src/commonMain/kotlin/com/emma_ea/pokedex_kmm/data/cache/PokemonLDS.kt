package com.emma_ea.pokedex_kmm.data.cache

import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon

interface PokemonLDS {

    suspend fun storeFavorite(pokemon: Pokemon): Int

    suspend fun allFavorites(): List<Pokemon>

    suspend fun removeFavorite(pokemon: Pokemon): Int

}
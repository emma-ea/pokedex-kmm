package com.emma_ea.pokedex_kmm.data.datasources.cache

import com.emma_ea.pokedex_kmm.models.PokemonModel

interface PokemonLDS {

    suspend fun storeFavorite(pokemon: PokemonModel): Int

    suspend fun allFavorites(): List<PokemonModel>

    suspend fun removeFavorite(pokemon: PokemonModel): Int

}
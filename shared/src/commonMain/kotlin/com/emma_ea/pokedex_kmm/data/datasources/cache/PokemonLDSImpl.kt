package com.emma_ea.pokedex_kmm.data.datasources.cache

import com.emma_ea.pokedex_kmm.models.PokemonModel

class PokemonLDSImpl : PokemonLDS {

    override suspend fun storeFavorite(pokemon: PokemonModel): Int {
        return -1
    }

    override suspend fun allFavorites(): List<PokemonModel> {
        return emptyList()
    }

    override suspend fun removeFavorite(pokemon: PokemonModel): Int {
        return -1
    }
}
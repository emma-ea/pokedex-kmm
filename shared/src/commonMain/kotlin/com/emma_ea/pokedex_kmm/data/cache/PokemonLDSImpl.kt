package com.emma_ea.pokedex_kmm.data.cache

import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon

class PokemonLDSImpl : PokemonLDS {

    override suspend fun storeFavorite(pokemon: Pokemon): Int {
        return -1
    }

    override suspend fun allFavorites(): List<Pokemon> {
        return emptyList()
    }

    override suspend fun removeFavorite(pokemon: Pokemon): Int {
        return -1
    }
}
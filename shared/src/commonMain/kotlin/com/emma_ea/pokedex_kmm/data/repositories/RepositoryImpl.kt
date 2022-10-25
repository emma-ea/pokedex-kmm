package com.emma_ea.pokedex_kmm.data.repositories

import com.emma_ea.pokedex_kmm.data.cache.PokemonLDS
import com.emma_ea.pokedex_kmm.data.network.PokemonRDS
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.repository.Repository


class RepositoryImpl(
    private val cache: PokemonLDS,
    private val remote: PokemonRDS,
) : Repository {

    // remote
    override suspend fun allPokemons(): List<Pokemon> {
        return remote.allPokemons()
    }

    override suspend fun fetchNextBatch(): List<Pokemon> {
        return remote.fetchNextBatch()
    }

    // local
    override suspend fun allFavorites(): List<Pokemon> {
        return cache.allFavorites()
    }

    override suspend fun cacheFavorite(pokemon: Pokemon): Int {
        return cache.storeFavorite(pokemon)
    }

    override suspend fun removeFavorite(Pokemon: Pokemon): Int {
        return cache.removeFavorite(Pokemon)
    }

}
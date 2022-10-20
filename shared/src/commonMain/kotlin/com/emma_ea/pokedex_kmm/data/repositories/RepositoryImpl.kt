package com.emma_ea.pokedex_kmm.data.repositories

import com.emma_ea.pokedex_kmm.data.datasources.cache.PokemonLDS
import com.emma_ea.pokedex_kmm.data.datasources.network.PokemonRDS
import com.emma_ea.pokedex_kmm.models.PokemonModel
import com.emma_ea.pokedex_kmm.repo.Repository


class RepositoryImpl(
    private val cache: PokemonLDS,
    private val remote: PokemonRDS,
) : Repository {

    // remote
    override suspend fun pokemonModels(): List<PokemonModel> {
        return remote.pokemons()
    }

    override suspend fun fetchNextBatch(): List<PokemonModel> {
        return remote.fetchNextBatch()
    }

    // local
    override suspend fun allFavorites(): List<PokemonModel> {
        return cache.allFavorites()
    }

    override suspend fun cacheFavorite(pokemon: PokemonModel): Int {
        return cache.storeFavorite(pokemon)
    }

    override suspend fun removeFavorite(Pokemon: PokemonModel): Int {
        return cache.removeFavorite(Pokemon)
    }

}
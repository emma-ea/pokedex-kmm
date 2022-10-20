package com.emma_ea.pokedex_kmm.di

import com.emma_ea.pokedex_kmm.data.datasources.cache.PokemonLDS
import com.emma_ea.pokedex_kmm.data.datasources.cache.PokemonLDSImpl
import com.emma_ea.pokedex_kmm.data.datasources.network.PokemonRDSImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import kotlin.math.sin

fun appModules() = listOf(
    repositoryModules
)

val repositoryModules = module {
    singleOf(::PokemonLDSImpl)
    singleOf(::PokemonRDSImpl)
}
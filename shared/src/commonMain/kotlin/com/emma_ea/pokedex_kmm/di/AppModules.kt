package com.emma_ea.pokedex_kmm.di

import com.emma_ea.pokedex_kmm.api.PokedexApi
import com.emma_ea.pokedex_kmm.core.DispatcherProvider
import com.emma_ea.pokedex_kmm.core.getDispatcherProvider
import com.emma_ea.pokedex_kmm.data.cache.PokemonLDS
import com.emma_ea.pokedex_kmm.data.cache.PokemonLDSImpl
import com.emma_ea.pokedex_kmm.data.network.PokemonRDS
import com.emma_ea.pokedex_kmm.data.network.PokemonRDSImpl
import com.emma_ea.pokedex_kmm.data.repositories.RepositoryImpl
import com.emma_ea.pokedex_kmm.repository.Repository
import com.emma_ea.pokedex_kmm.usecase.FetchPokemonsUsecase
import com.emma_ea.pokedex_kmm.usecase.GetPokemonsUsecase
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun appModules() = listOf(
    repositoryModules, coreModules, usecaseModules
)

val repositoryModules = module {
    factory<PokemonRDS> { PokemonRDSImpl(get(), get()) }
    factory<PokemonLDS> { PokemonLDSImpl() }
    single<Repository> { RepositoryImpl(get(), get()) }
}

val coreModules = module {
    factory { PokedexApi() }
    factory { getDispatcherProvider() }
}

val usecaseModules = module {
    factory { FetchPokemonsUsecase() }
}

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(appModules())
    }
}
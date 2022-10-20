package com.emma_ea.pokedex_kmm.di

import org.koin.core.context.startKoin

fun injectorInit() {
    startKoin {
        modules(appModules())
    }
}
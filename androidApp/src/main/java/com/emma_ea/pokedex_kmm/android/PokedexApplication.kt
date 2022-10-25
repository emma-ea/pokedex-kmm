package com.emma_ea.pokedex_kmm.android

import android.app.Application
import com.emma_ea.pokedex_kmm.android.di.viewModelModules
import com.emma_ea.pokedex_kmm.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PokedexApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@PokedexApplication)
            modules(viewModelModules)
        }
    }
}
package com.emma_ea.pokedex_kmm.android.di

import com.emma_ea.pokedex_kmm.android.viewmodel.MainScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {
    viewModel { MainScreenViewModel(get()) }
}
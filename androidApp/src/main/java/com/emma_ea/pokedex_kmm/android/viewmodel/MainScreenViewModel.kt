package com.emma_ea.pokedex_kmm.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.usecase.FetchPokemonsUsecase
import io.github.aakira.napier.Napier
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainScreenViewModel(
    private val fetchPokemons: FetchPokemonsUsecase
) : ViewModel() {

    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons = _pokemons

    private val errorHandler = CoroutineExceptionHandler { _, throwable ->
        Napier.e(throwable.localizedMessage ?: "something went wrong", throwable)
    }

    init {
        viewModelScope.launch(errorHandler) {
            getPokemons()
        }
    }

    private suspend fun getPokemons() {
        _pokemons.value = fetchPokemons()
        Napier.v("[fetching pokemons]")
    }

}
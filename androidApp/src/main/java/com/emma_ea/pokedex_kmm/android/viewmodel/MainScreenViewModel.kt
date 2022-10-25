package com.emma_ea.pokedex_kmm.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.usecase.FetchPokemonsUsecase
import io.github.aakira.napier.Napier
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

    init {
        viewModelScope.launch {
            getPokemons()
        }
    }

    private suspend fun getPokemons() {
        _pokemons.value = fetchPokemons.invoke()
        Napier.v("[fetching pokemons]")
    }

}
package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.emma_ea.pokedex_kmm.android.viewmodel.MainScreenViewModel
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.usecase.FetchPokemonsUsecase

@Composable
fun MainScreen(
    viewModel: MainScreenViewModel
) {
    Column (
        modifier = Modifier.fillMaxSize(),
    ) {
        Text("data")
        Spacer(Modifier.height(100.dp))
        BuildPokemons(viewModel.pokemons.value)
    }
}

@Composable
fun BuildPokemons(pokemons: List<PokemonModel>) {
    for (pokemon in pokemons) {
        Text(pokemon.name)
    }
}
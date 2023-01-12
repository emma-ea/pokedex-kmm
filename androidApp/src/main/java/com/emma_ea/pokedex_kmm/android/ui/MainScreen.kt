package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.emma_ea.pokedex_kmm.android.viewmodel.MainScreenViewModel
import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.usecase.FetchPokemonsUsecase

@Composable
fun MainScreen(
    pokemons: List<Pokemon>
) {
    Column (
        modifier = Modifier.fillMaxSize(),
    ) {
        BuildPokemons(pokemons)
    }
}

@Composable
fun BuildPokemons(pokemons: List<Pokemon>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        items(pokemons) { pokemon ->
            PokemonCard()
        }
    }
}
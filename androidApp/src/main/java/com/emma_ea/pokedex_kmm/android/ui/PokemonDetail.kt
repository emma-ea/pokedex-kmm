package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.emma_ea.pokedex_kmm.android.R

@Composable
fun PokemonDetail() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {

        // nav bar
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "back button")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.FavoriteBorder, contentDescription = "favorite button")
            }
        }


    }
}
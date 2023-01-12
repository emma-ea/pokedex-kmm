package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emma_ea.pokedex_kmm.android.R

@Composable
fun PokemonDetail() {
    val scrollState = rememberScrollState()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar() }
    ) {
        Column(modifier = Modifier.padding(horizontal = 30.dp)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "Bulbasaur",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Row() {
                        Text(text = "Grass")
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "Poison")
                    }

                }
                Text(text = "#001")
            }

            Image(
                painter = painterResource(id = R.drawable.pngegg),
                contentDescription = "balbasaur image"
            )

        }
    }
}

@Composable
fun TopBar() {
    TopAppBar(
        navigationIcon = {
            Icon(Icons.Filled.ArrowBack, contentDescription = "back arrow")
        },
        title = {},
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.FavoriteBorder, contentDescription = "favorite icon")
            }
        },
        backgroundColor = Color.Transparent,
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp)
    )
}

@Preview
@Composable
fun PreviewDetail() {
    PokemonDetail()
}
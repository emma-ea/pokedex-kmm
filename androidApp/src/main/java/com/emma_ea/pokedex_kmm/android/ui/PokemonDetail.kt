package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
        backgroundColor = Color(greenSeaColor),
        topBar = { TopBar() }
    ) {
        Box {
            Column(
                modifier = Modifier.padding(horizontal = 30.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column {
                        Text(
                            text = "Bulbasaur",
                            fontSize = 30.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                        )

                        Row() {
                            Text(text = "Grass", color = Color.White,)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Poison", color = Color.White,)
                        }

                    }
                    Text(text = "#001", color = Color.White,)
                }

                Image(
                    painter = painterResource(id = R.drawable.pngegg),
                    contentDescription = "balbasaur image"
                )

            }

            Card(
                modifier = Modifier.fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
                Column() {
                    Text(text = "Grass")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Poison")
                }
            }
        }

    }
}

@Composable
fun TopBar() {
    TopAppBar(
        navigationIcon = {
            Icon(Icons.Filled.ArrowBack, tint = Color.White, contentDescription = "back arrow")
        },
        title = {},
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.FavoriteBorder, tint = Color.White, contentDescription = "favorite icon")
            }
        },
        backgroundColor = Color.Transparent,
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 30.dp),
        elevation = 0.dp
    )
}

@Preview
@Composable
fun PreviewDetail() {
    PokemonDetail()
}
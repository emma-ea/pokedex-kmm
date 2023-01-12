package com.emma_ea.pokedex_kmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.android.ui.MainScreen
import com.emma_ea.pokedex_kmm.android.ui.MyApplicationTheme
import com.emma_ea.pokedex_kmm.android.viewmodel.MainScreenViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val model by viewModel<MainScreenViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val pokemons = model.pokemons.value;
                    val pokemons = listOf<Pokemon>(
                        Pokemon(1, "Balbasaur"),
                        Pokemon(2, "Balbasaur"),
                        Pokemon(3, "Balbasaur"),
                        Pokemon(4, "Balbasaur"),
                        Pokemon(5, "Balbasaur"),
                        Pokemon(6, "Balbasaur"),
                    )
                    MainScreen(pokemons)
                }
            }
        }
    }
}

@Composable
fun Screens() {

}


@Preview
@Composable
fun DefaultPreview() {
    val pokemons = listOf<Pokemon>(
        Pokemon(1, "Balbasaur"),
        Pokemon(2, "Balbasaur"),
        Pokemon(3, "Balbasaur"),
        Pokemon(4, "Balbasaur"),
        Pokemon(5, "Balbasaur"),
        Pokemon(6, "Balbasaur"),
    )
    MyApplicationTheme {
        MainScreen(pokemons = pokemons)
    }
}

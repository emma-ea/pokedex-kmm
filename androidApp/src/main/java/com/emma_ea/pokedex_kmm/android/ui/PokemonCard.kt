package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emma_ea.pokedex_kmm.android.R

@Composable
fun PokemonCard() {
    Card { 
        Box(modifier = Modifier
            .padding(8.dp)
            .size(200.dp, 150.dp)
            .border(shape = CircleShape, width = 1.dp, color = Color.White)
            .padding(20.dp)
        ) {
            // show title
            Image(
                painter = painterResource(id = R.drawable.pngegg),
                contentDescription = "pokemon image",
                modifier = Modifier.width(110.dp)
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
            )
            // show image
            Column (modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)) {
                Text(
                    "Balbasaur",
                    color = Color.Black,
                    fontSize = 30.sp,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )
                OvalTextBg("Power")
                Spacer(modifier = Modifier.height(6.dp))
                OvalTextBg("Stats")
            }
            // show properties
        }    
    }
}

@Composable
fun OvalTextBg(text: String) {
    Surface(
        modifier = Modifier
            .border(width = 1.dp, shape = CircleShape, color = Color.Blue)
            .padding(horizontal = 20.dp, vertical = 8.dp)
    ) {
        Text(text)
    }
}

@Preview(showBackground = false)
@Composable
fun CardPreview() {
    PokemonCard()
}
package com.emma_ea.pokedex_kmm.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emma_ea.pokedex_kmm.android.R

@Composable
fun PokemonCard() {
    // background
    val cardBackground = Color(greenSeaColor)
    // image
    val imageSrc = R.drawable.pngegg
    // title
    val title = "Balbasaur"
    // sub texts - 2
    val subtitle1 = "Power"
    val  subtitle2 = "Stats"
    Card {
        Box(modifier = Modifier
            .background(cardBackground)
            .width(200.dp)
            .padding(10.dp)
        ) {
            // show title
            Image(
                painter = painterResource(id = imageSrc),
                contentDescription = "$title image",
                modifier = Modifier
                    .width(110.dp)
                    .align(Alignment.BottomEnd)
            )
            // show image
            Column (
                modifier = Modifier.padding(end = 20.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                )
                OvalTextBg(subtitle1)
                Spacer(modifier = Modifier.height(6.dp))
                OvalTextBg(subtitle2)
            }
            // show properties
        }    
    }
}

@Composable
fun OvalTextBg(text: String) {
    Surface() {
        
    }
    Text(
        text = text,
    )
}

@Preview(showBackground = false)
@Composable
fun CardPreview() {
    PokemonCard()
}
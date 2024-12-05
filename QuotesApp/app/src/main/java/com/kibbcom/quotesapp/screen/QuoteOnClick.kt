package com.kibbcom.quotesapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable

fun quoteOnClick() {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFD6589F),
                        Color(0xFFD895DA)

                    )
                )
            )
    ) {
        Card (
            elevation = CardDefaults.cardElevation(8.dp),
            modifier = Modifier
                .padding(horizontal = 30.dp)

        ){
           Column {
               Image(
                   imageVector = Icons.Outlined.Favorite,
                   contentDescription = "Quote Heart Image",

               )
               Spacer(modifier = Modifier
                   .padding(5.dp))
               
               Text(text = "Success is not final, failure is not fatal: It is the courage to continue that counts.")

               Spacer(modifier = Modifier
                   .padding(10.dp))
               
               Text(text = "Winston Churchill")
           }   
        }

    }
}

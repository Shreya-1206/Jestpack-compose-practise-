package com.kibbcom.quotesapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable

fun quoteListItem () {
    Card (
        elevation = CardDefaults.cardElevation(8.dp)

    ){
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "Quote Image"
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column {
                Text(text = "Success is not final, failure is not fatal: It is the courage to continue that counts.")


                Spacer(modifier = Modifier.padding(4.dp))
                Text(text = "Winston Churchill")
            }
        }
    }
}
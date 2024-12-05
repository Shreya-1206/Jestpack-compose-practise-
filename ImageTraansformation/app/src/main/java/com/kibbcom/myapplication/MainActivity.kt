package com.kibbcom.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.collection.CircularArray
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageTranform()
        }
    }
}

@Composable
fun ImageTranform() {
    Image(
        painter = painterResource(id = R.drawable.pancakes),
        contentDescription = "dog image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .shadow(20.dp, CircleShape) // Just use elevation and shape here
            .clip(CircleShape)
            .size(300.dp)
            .border(3.dp, Color.Gray, CircleShape)
    )


}

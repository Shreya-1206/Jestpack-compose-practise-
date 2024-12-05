package com.kibbcom.practise1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kibbcom.practise1.ui.theme.Practise1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    var state = remember {mutableStateOf("")}

    Box(
        modifier = Modifier.fillMaxSize(), // Make the Box fill the entire screen
        contentAlignment = Alignment.Center // Center the content inside the Box
    ) {
        TextField(
            value = state.value,
            onValueChange = {
                state.value = it
            },
            isError = false,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF2BED1), // Set the container color here
                focusedIndicatorColor = Color.Transparent, // Optional: remove focus indicator
                unfocusedIndicatorColor = Color.Transparent // Optional: remove unfocused indicator
            ),
            modifier = Modifier.align(Alignment.Center) // Center the TextField inside the Box
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Greeting()
}
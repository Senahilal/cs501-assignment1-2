package com.example.helloworldbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworldbutton.ui.theme.HelloWorldButtonTheme

import androidx.compose.ui.unit.dp
import androidx.compose.ui.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldButtonTheme {

                Greeting(
                    modifier = Modifier.padding()
                )

            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    var text: String by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(48.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(text) // Display text
        FilledButton(onClick = { text = "Hello World!!!" }) // Button

    }


}

@Composable
fun FilledButton(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text("Click Here!!!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldButtonTheme {
        Greeting()
    }
}


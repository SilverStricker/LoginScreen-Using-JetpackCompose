package com.example.jetpacksample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacksample.ui.theme.JetpackSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    exampleScreen()
                }
            }
        }
    }
}

@Composable
fun exampleScreen()
{
        Column( modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)  {
            Card(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(), elevation = CardDefaults.cardElevation(4.dp)) {
                Column{
                    Text(text = "Hello Jetpack Compose",modifier = Modifier
                        .padding(2.dp)
                        .clickable { })
                    Spacer(modifier = Modifier.padding(horizontal = 5.dp))
//        Text(text = "Introduction")
                    Button(onClick = { /*TODO*/ }) {

                        Text(text = "OK")

                    }
                }

            }
        }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackSampleTheme {
//        Greeting("Android")
        exampleScreen()
    }
}
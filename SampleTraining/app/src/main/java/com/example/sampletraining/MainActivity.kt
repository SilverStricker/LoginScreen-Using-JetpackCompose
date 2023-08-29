package com.example.sampletraining

//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sampletraining.ui.theme.SampleTrainingTheme
import com.example.sampletraining.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme(){
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                simpleText()
                simpleTextField()
                Column (modifier = Modifier.fillMaxSize(1f) ,verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
                    simpleButton()
                }
                }
            }
        }
    }
}

@Composable
fun simpleText(){

    Text(text = "Hello World", modifier = Modifier.padding(16.dp),
        style =  TextStyle.Default
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField(){

    var text by remember { mutableStateOf("") }
    TextField(value = text , onValueChange = {it -> text = it }, label = { Text(text = "User Name")}  )
}


@Composable
fun simpleButton(){

    Button(modifier = Modifier.padding(16.dp), onClick = { /*TODO*/ }) {
        Text(text = "OK")
    }


}


@Preview
@Composable
fun simpleTextPreview(){
    MyAppTheme(){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            simpleText()
            simpleTextField()
            Column (modifier = Modifier.fillMaxSize(1f) ,verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
                simpleButton()
            }
        }
    }
}



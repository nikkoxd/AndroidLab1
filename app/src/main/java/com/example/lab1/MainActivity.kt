package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Title(name = "Владислав Некрасов", title = "Студент ИжГТУ")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Lab1Theme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Title(name = "Владислав Некрасов", title = "Студент ИжГТУ")
        }
    }
}

@Composable
fun Title(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = name,
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = title,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
        )
    }
}
package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1Theme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFD2E8D4))
                ) {
                    Title(
                        name = "Владислав Некрасов",
                        title = "Студент ИжГТУ",
                        modifier = Modifier
                            .weight(1f)
                            .align(Alignment.CenterHorizontally)
                    )
                    Contacts(
                        phone = "+00 (00) 000 000",
                        handle = "@socialmediahandle",
                        email = "email@domail.com",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(IntrinsicSize.Max)
                            .padding(bottom = 24.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Lab1Theme {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
        ) {
            Title(
                name = "Владислав Некрасов",
                title = "Студент ИжГТУ",
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterHorizontally)
            )
            Contacts(
                phone = "+00 (00) 000 000",
                handle = "@socialmediahandle",
                email = "email@domail.com",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(IntrinsicSize.Max)
                    .padding(bottom = 24.dp)
            )
        }
    }
}

@Composable
fun Title(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier.background(Color(0xFF073042))
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.width(120.dp)
            )
        }
        Text(
            text = name,
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00602A),
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun Contacts(phone: String, handle: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = phone,
            )
        }
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Share,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = handle,
            )
        }
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = null,
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = email,
            )
        }
    }
}
package com.aslanjavasky.gringottsapplication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aslanjavasky.gringottsapplication.R



@Composable
fun WelcomeScreen() {

    var name by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.gringotts_welcomescreen
                ),
                contentDescription = "Image of Gringotts Bank",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(4.dp)

            ) {
                Text(
                    "Hello, $name ! Welcome to Gringotts Bank!",
                    color = Color.White,
                    fontSize = 32.sp,
                    textAlign = TextAlign.Center

                )

                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {  }) {
                    Text("Start", fontSize = 32.sp)
                }

                OutlinedTextField(
                    label={ Text(text = "Enter your name", color = Color.White) },
                    value = name    ,
                    onValueChange = { name=it},
                    singleLine = true,
                    textStyle = TextStyle(color=Color.White, fontSize = 32.sp),
                )


            }
        }


    }
}



@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
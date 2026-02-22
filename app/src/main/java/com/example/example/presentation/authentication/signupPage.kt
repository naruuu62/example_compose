package com.example.example.presentation.authentication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.example.ui.theme.TextColor
import com.example.example.ui.theme.poppins

@Composable
@Preview
fun SignUpPage(){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.White)
    ) {
        Text("Selamat Datang", style = TextStyle(fontSize = 40.sp), color = TextColor, fontFamily = poppins)
    }
}
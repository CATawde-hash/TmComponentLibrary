package org.example.project.tmcomponentlibrary

import androidx.compose.foundation.background
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun tmTextView(){

    Text("Hi, I am from Shared Library" , color = Color.Blue, modifier = Modifier.background(Color.Yellow))
}
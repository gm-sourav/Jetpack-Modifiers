package com.example.jetpack_modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Task3() {
    Text(
        text = "Akash", Modifier
            .border(2.dp, color = Color.Red)
            .background(color = Color.Yellow)
            .padding(16.dp),
                fontSize = 20.sp
    )
}
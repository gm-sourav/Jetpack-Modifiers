package com.example.jetpack_modifiers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Task4() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Magenta, shape = RoundedCornerShape(16.dp))
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)


    ) {
        Text(text = "Name  : Sourov", fontSize = 20.sp)
        Text(text = "Email : souravmahbub13@gmail.com", fontSize = 20.sp)
        Text(text = "Phone : 01714401614", fontSize = 20.sp)
    }
}
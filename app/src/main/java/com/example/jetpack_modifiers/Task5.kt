package com.example.jetpack_modifiers

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun RealUi() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Green)
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Magenta)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Apple",
                fontSize = 20.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Banana",
                fontSize = 20.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Grapes",
                fontSize = 20.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold
            )
        }

        Box(
            modifier = Modifier
                .border(width = 5.dp, shape = RoundedCornerShape(16.dp), color = Color.White)
                .background(color = Color.Blue, shape = RoundedCornerShape(16.dp))
                .size(200.dp)
                .clickable(onClick = { }),

            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Center",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Magenta)
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "One", fontSize = 20.sp, color = Color.Yellow, fontWeight = FontWeight.Bold)
            Text(text = "Two", fontSize = 20.sp, color = Color.Yellow, fontWeight = FontWeight.Bold)
            Text(
                text = "Three",
                fontSize = 20.sp,
                color = Color.Yellow,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
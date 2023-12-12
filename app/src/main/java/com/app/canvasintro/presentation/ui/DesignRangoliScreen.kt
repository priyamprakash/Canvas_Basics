package com.app.canvasintro.presentation.ui

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun DesignRangoliScreen(navigateBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                text = "Design Rangoli Screen",
                style = MaterialTheme.typography.bodyMedium
            )
            Button(
                onClick = navigateBack,
                modifier = Modifier
                    .wrapContentSize()
            ) {
                Text(text = "Go Back")
            }
        }

        RangoliDesign()
    }
}

@Composable
fun RangoliDesign() {
    Canvas(
        modifier = Modifier
            .padding(20.dp)
            .size(300.dp)
    ) {
        drawRect(
            color = Color.DarkGray,
            size = size
        )
        drawRect(
            color = Color.White,
            topLeft = Offset(10.dp.toPx(), 10.dp.toPx()),
            size = Size(280.dp.toPx() , 280.dp.toPx()),
            style = Stroke(width = 3.dp.toPx())
        )
        drawCircle(
            color = Color.LightGray,
            radius = 135f
        )
        drawCircle(
                color = Color.Gray,
                radius = 125f
        )
        drawCircle(
                color = Color.Yellow,
                radius = 100f
        )
        drawArc(
            color = Color.Green,
            startAngle = 90f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(20.dp.toPx(), 20.dp.toPx()),
            size = Size(200f, 200f),
        )
        drawArc(
            color = Color.Green,
            startAngle = 180f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(210.dp.toPx(), 20.dp.toPx()),
            size = Size(200f, 200f),
        )
        drawArc(
            color = Color.Green,
            startAngle = 270f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(210.dp.toPx(), 210.dp.toPx()),
            size = Size(200f, 200f),
        )
        drawArc(
            color = Color.Green,
            startAngle = 360f,
            sweepAngle = 270f,
            useCenter = true,
            topLeft = Offset(20.dp.toPx(), 210.dp.toPx()),
            size = Size(200f, 200f),
        )
    }
}
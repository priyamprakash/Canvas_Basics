package com.app.canvasintro.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CanvasIntroScreen(navigateBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.wrapContentSize().align(Alignment.CenterVertically),
                textAlign = TextAlign.Center,
                text = "Canvas Intro Screen",
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

    }
}

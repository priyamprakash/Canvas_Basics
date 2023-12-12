package com.app.canvasintro.presentation.ui

import android.util.Log.v
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.app.canvasintro.presentation.screens.Screen

@Composable
fun HomeScreen(
    navController: NavController,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Home Screen", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { navController.navigate(Screen.CanvasIntro.route) },
            modifier = Modifier
                .wrapContentSize()
        ) {
            Text(text = "Canvas Intro")
        }
        Button(
            onClick = { navController.navigate(Screen.DesignRangoli.route) },
            modifier = Modifier
                .wrapContentSize()
        ) {
            Text(text = "Pattern with Canvas")
        }
    }
}

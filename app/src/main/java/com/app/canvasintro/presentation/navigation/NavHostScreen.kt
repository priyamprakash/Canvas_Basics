package com.app.canvasintro.presentation.navigation

// NavHostScreen.kt
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.app.canvasintro.presentation.ui.CanvasIntroScreen
import com.app.canvasintro.presentation.ui.HomeScreen
import com.app.canvasintro.presentation.screens.Screen
import com.app.canvasintro.presentation.theme.CanvasIntroTheme

@Composable
fun NavHostScreen() {
    CanvasIntroTheme {
        // Set up Navigation
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route
        ) {
            composable(route = Screen.Home.route) {
                HomeScreen(
                    navigateToCanvasIntro = { navController.navigate(Screen.CanvasIntro.route) }
                )
            }
            composable(route = Screen.CanvasIntro.route) {
                CanvasIntroScreen(
                    navigateBack = { navController.popBackStack() }
                )
            }
        }
    }
}

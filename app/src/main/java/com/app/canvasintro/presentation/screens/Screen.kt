package com.app.canvasintro.presentation.screens

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object CanvasIntro : Screen("canvas_intro_screen")
    object DesignRangoli : Screen("design_rangoli_screen")
}
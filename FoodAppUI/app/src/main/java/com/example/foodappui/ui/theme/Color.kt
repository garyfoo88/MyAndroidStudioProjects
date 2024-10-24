package com.example.foodappui.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// Define a color palette
object FoodAppColors {
    val Pink = Color(0xFFF28482)
    val Green = Color(0xFF84A59D)
    val Yellow = Color(0xFFF7EDE2)
    val YellowLight = Color(0xFFFFFFF2)
    val Dark = Color(0xFF3D405B)
    val White = Color.White
}

// Data class for app colors, immutable for performance benefits
@Immutable
data class AppColors(
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val secondarySurface: Color,
    val onSecondarySurface: Color,
    val regularSurface: Color,
    val onRegularSurface: Color,
    val actionSurface: Color,
    val onActionSurface: Color,
    val highlightSurface: Color,
    val onHighlightSurface: Color
)

// Provide default colors for when no theme is provided
val localAppColors = staticCompositionLocalOf {
    AppColors(
        background = FoodAppColors.White,
        onBackground = FoodAppColors.Dark,
        surface = FoodAppColors.White,
        onSurface = FoodAppColors.Dark,
        secondarySurface = FoodAppColors.Pink,
        onSecondarySurface = FoodAppColors.White,
        regularSurface = FoodAppColors.YellowLight,
        onRegularSurface = FoodAppColors.Dark,
        actionSurface = FoodAppColors.Yellow,
        onActionSurface = FoodAppColors.Pink,
        highlightSurface = FoodAppColors.Green,
        onHighlightSurface = FoodAppColors.White
    )
}

// Define the extended color palette
val extendedColor = AppColors(
    background = FoodAppColors.White,
    onBackground = FoodAppColors.Dark,
    surface = FoodAppColors.White,
    onSurface = FoodAppColors.Dark,
    secondarySurface = FoodAppColors.Pink,
    onSecondarySurface = FoodAppColors.White,
    regularSurface = FoodAppColors.YellowLight,
    onRegularSurface = FoodAppColors.Dark,
    actionSurface = FoodAppColors.Yellow,
    onActionSurface = FoodAppColors.Pink,
    highlightSurface = FoodAppColors.Green,
    onHighlightSurface = FoodAppColors.White
)

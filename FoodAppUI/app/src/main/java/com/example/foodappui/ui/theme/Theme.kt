package com.example.foodappui.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AppTheme(
    colors: AppColors = extendedColor,
    typography: AppTypography = extendedTypography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        localAppColors provides colors,
        localAppTypography provides typography
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object AppTheme {
    val colors: AppColors
        @Composable
        get() = localAppColors.current
    val typography: AppTypography
        @Composable
        get() = localAppTypography.current
}
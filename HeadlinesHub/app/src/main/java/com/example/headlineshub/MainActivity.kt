package com.example.headlineshub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.example.headlineshub.ui.screens.OnboardingScreen
import com.example.headlineshub.ui.theme.HeadlinesHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        installSplashScreen()
        setContent {
            HeadlinesHubTheme(
                dynamicColor = false
            ) {
                Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
                    OnboardingScreen()
                }
            }
        }
    }
}
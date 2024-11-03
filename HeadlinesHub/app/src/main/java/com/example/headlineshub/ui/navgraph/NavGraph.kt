package com.example.headlineshub.ui.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.headlineshub.ui.screens.OnboardingScreen
import com.example.headlineshub.viewmodel.OnboardingViewModel

@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = startDestination
    ) {
        navigation(
            route = Route.AppStartNavigation.name,
            startDestination = Route.OnboardingScreen.name
        ) {
            composable(
                route = Route.OnboardingScreen.name
            ) {
                val viewModel: OnboardingViewModel = hiltViewModel()
                OnboardingScreen(onEvent = viewModel::onEvent)
            }
        }

        navigation(
            route = Route.NewsNavigation.name,
            startDestination = Route.HomeScreen.name
        ) {
            composable(route = Route.HomeScreen.name) {

            }
            composable(route = Route.SearchScreen.name) {

            }
            composable(route = Route.BookmarkScreen.name) {

            }
            composable(route = Route.DetailsScreen.name) {

            }
        }
    }
}
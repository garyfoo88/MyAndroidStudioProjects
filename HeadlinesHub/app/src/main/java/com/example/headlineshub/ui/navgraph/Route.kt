package com.example.headlineshub.ui.navgraph

import androidx.navigation.NamedNavArgument

sealed class Route(
    val name: String,
    val arguments: List<NamedNavArgument> = emptyList()
) {
    data object OnboardingScreen : Route(name = "onBoardingScreen")

    data object HomeScreen : Route(name = "homeScreen")

    data object SearchScreen : Route(name = "searchScreen")

    data object BookmarkScreen : Route(name = "bookMarkScreen")

    data object DetailsScreen : Route(name = "detailsScreen")

    data object AppStartNavigation : Route(name = "appStartNavigation")

    data object NewsNavigation : Route(name = "newsNavigation")
}
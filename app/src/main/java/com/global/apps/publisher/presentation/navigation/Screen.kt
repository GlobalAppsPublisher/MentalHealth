package com.global.apps.publisher.presentation.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")

    object Onboarding : Screen("onboarding_screen")

    object Home : Screen("home_screen")

    object Insights : Screen("insights_screen")

    object Notifications : Screen("notifications_screen")

    object Settings : Screen("settings_screen")
}

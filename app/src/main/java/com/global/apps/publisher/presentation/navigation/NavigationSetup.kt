package com.global.apps.publisher.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.global.apps.publisher.presentation.screens.home.HomeScreen
import com.global.apps.publisher.presentation.screens.insight.InsightsScreen
import com.global.apps.publisher.presentation.screens.notifications.NotificationsScreen
import com.global.apps.publisher.presentation.screens.settings.SettingsScreen

@Composable
fun NavigationSetup(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavigationItem.Home.route) {
        composable(BottomNavigationItem.Home.route) {
            HomeScreen()
        }
        composable(BottomNavigationItem.Insights.route) {
            InsightsScreen()
        }
        composable(BottomNavigationItem.Notifications.route) {
            NotificationsScreen()
        }
        composable(BottomNavigationItem.Settings.route) {
            SettingsScreen()
        }
    }
}


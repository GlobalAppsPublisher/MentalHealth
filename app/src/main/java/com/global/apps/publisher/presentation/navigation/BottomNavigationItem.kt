package com.global.apps.publisher.presentation.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.global.apps.publisher.presentation.R

sealed class BottomNavigationItem(
    val route: String,
    @StringRes val titleResId: Int,
    val icon: ImageVector
) {
    object Home : BottomNavigationItem(
        route = Screen.Home.route,
        titleResId = R.string.home,
        icon = Icons.Rounded.Home
    )

    object Insights : BottomNavigationItem(
        route = Screen.Insights.route,
        titleResId = R.string.insights,
        icon = Icons.Rounded.List
    )

    object Notifications : BottomNavigationItem(
        route = Screen.Notifications.route,
        titleResId = R.string.notifications,
        icon = Icons.Rounded.Notifications
    )

    object Settings : BottomNavigationItem(
        route = Screen.Settings.route,
        titleResId = R.string.settings,
        icon = Icons.Rounded.Settings
    )
}
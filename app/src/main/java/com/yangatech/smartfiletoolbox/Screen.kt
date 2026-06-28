package com.yangatech.smartfiletoolbox

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val label: String, val icon: ImageVector) {
    object Home : Screen("home", "Home", Icons.Filled.Home)
    object Tools : Screen("tools", "Tools", Icons.Filled.Build)
    object Files : Screen("files", "Files", Icons.Filled.Folder)
    object Recent : Screen("recent", "Recent", Icons.Filled.History)
    object Settings : Screen("settings", "Settings", Icons.Filled.Settings)
}

val bottomNavItems = listOf(Screen.Home, Screen.Tools, Screen.Files, Screen.Recent, Screen.Settings)

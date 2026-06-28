package com.yangatech.smartfiletoolbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yangatech.smartfiletoolbox.screens.FilesScreen
import com.yangatech.smartfiletoolbox.screens.HomeScreen
import com.yangatech.smartfiletoolbox.screens.RecentScreen
import com.yangatech.smartfiletoolbox.screens.SettingsScreen
import com.yangatech.smartfiletoolbox.screens.ToolsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartFileToolboxApp()
        }
    }
}

@Composable
fun SmartFileToolboxApp() {
    MaterialTheme {
        Surface {
            val navController = rememberNavController()

            Scaffold(
                bottomBar = { BottomNavBar(navController) }
            ) { innerPadding ->
                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.route,
                    modifier = Modifier.padding(innerPadding)
                ) {
                    composable(Screen.Home.route) { HomeScreen() }
                    composable(Screen.Tools.route) { ToolsScreen() }
                    composable(Screen.Files.route) { FilesScreen() }
                    composable(Screen.Recent.route) { RecentScreen() }
                    composable(Screen.Settings.route) { SettingsScreen() }
                }
            }
        }
    }
}

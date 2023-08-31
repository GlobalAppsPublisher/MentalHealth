package com.global.apps.publisher.presentation.screens.container

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.global.apps.publisher.presentation.navigation.BottomNavigationBar
import com.global.apps.publisher.presentation.navigation.NavigationSetup
import com.global.apps.publisher.presentation.utilities.themes.MentalHealthTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MentalHealthTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(navController)
                        }
                    ) {
                        NavigationSetup(navController = navController)
                    }
                }
            }
        }
    }
}

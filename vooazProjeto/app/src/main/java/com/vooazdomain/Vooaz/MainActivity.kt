package com.vooazdomain.Vooaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

import com.vooazdomain.Vooaz.navigationflow.NavigationFlowSettings
import com.vooazdomain.Vooaz.splashpage.addSplashPage
import com.vooazdomain.Vooaz.ui.theme.VooazTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val splashScreen = installSplashScreen()

        addSplashPage(splashScreen)
        setContent {
            VooazTheme() {

                NavigationFlowSettings()
            }

            }
        }
    }

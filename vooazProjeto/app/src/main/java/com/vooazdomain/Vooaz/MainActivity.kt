package com.vooazdomain.Vooaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import com.vooazdomain.Vooaz.telas.InputScreen
import com.vooazdomain.Vooaz.telas.PlanScreenSuggestion
import com.vooazdomain.Vooaz.telas.ForgotPassword
import com.vooazdomain.Vooaz.telas.ForgotPasswordPin


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { true }
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000L)

            splashScreen.setKeepOnScreenCondition { false }
        }
        setContent {
            VooazTheme() {
                val navController = rememberNavController()
                NavHost(navController= navController , startDestination = "ForgotPasswordPin") {

                    composable("PlanScreenSuggestion") {
                        PlanScreenSuggestion(navController)
                    }
                    composable("ForgotPassword"){
                        ForgotPassword(navController)
                    }
                    composable("ForgotPasswordPin") {
                        ForgotPasswordPin(navController)
                        
                    }
                }

            }
        }
    }
}

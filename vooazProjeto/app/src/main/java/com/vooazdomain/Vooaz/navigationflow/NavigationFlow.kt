package com.vooazdomain.Vooaz.navigationflow

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.telas.inputflow.InputScreen
import com.vooazdomain.Vooaz.telas.inputflow.LoginScreen
import com.vooazdomain.Vooaz.telas.plan.PlanSuggestionScreen
import com.vooazdomain.Vooaz.telas.inputflow.RegisterAccountContent
import com.vooazdomain.Vooaz.telas.plan.Plans
import com.vooazdomain.Vooaz.telas.resetpassword.ChangePasswordScreen
import com.vooazdomain.Vooaz.telas.resetpassword.ForgotPasswordPinScreen
import com.vooazdomain.Vooaz.telas.resetpassword.ForgotPasswordScreen

import navegationBar
@Composable
fun NavigationFlowSettings() {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = {  innerPadding ->
            innerPadding
            NavHost(
                navController = navController,
                startDestination = "ForgotPasswordPin"
            ) {


                composable("PlanScreenSuggestion") {
                    PlanSuggestionScreen(navController)
                }
                composable("Plans") {
                    Plans(navController)
                }

                composable("ForgotPassword") {
                    ForgotPasswordScreen(navController)
                }
                composable("ForgotPasswordPin") {
                    ForgotPasswordPinScreen(navController)
                }
                composable("ChangePasswordScreen") {
                    ChangePasswordScreen(navController)
                }
                composable("LoginScreen") {
                   LoginScreen(navController)
                }
                composable("RegisterAccountScreen") {
                    RegisterAccountContent(navController)
                }
                composable("InputScreen") {
                    InputScreen(navController)
                }
            }
        },
        // Adicione a bottomBar apenas quando a rota for "PlanScreenSuggestion"
        bottomBar = {
            if (currentRoute == "") {
                navegationBar(navController)
            }
        }
    )
}

package com.vooazdomain.Vooaz.navigationflow

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.app.ui.screens.AzConnectProfileScreen
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.telas.azconnect.ConnectionsSearchScreen
import com.vooazdomain.Vooaz.telas.azconnect.connections
import com.vooazdomain.Vooaz.telas.inputflow.InputFullRegisterScreen
import com.vooazdomain.Vooaz.telas.inputflow.InputScreen
import com.vooazdomain.Vooaz.telas.inputflow.LoginScreen
import com.vooazdomain.Vooaz.telas.plan.PlanSuggestionScreen
import com.vooazdomain.Vooaz.telas.inputflow.RegisterAccountContent
import com.vooazdomain.Vooaz.telas.plan.Plans
import com.vooazdomain.Vooaz.telas.profile.ProfileScreen
import com.vooazdomain.Vooaz.telas.resetpassword.ChangePasswordScreen
import com.vooazdomain.Vooaz.telas.resetpassword.ForgotPasswordPinScreen
import com.vooazdomain.Vooaz.telas.resetpassword.ForgotPasswordScreen
import com.vooazdomain.Vooaz.telas.settingScreen.SettingsScreen

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
                startDestination = "ConnectionsSearchScreen"
            ) {


                composable("PlanScreenSuggestion") {
                    PlanSuggestionScreen(navController)
                }
                composable("ConnectionsSearchScreen") {
                    val sampleconnections = listOf(
                        connections("Fabio Nascimento", "Paris, França", R.drawable.ic_profile_placeholder, "Fabio"),
                        connections("Lais\n" +
                                "Ribeiro", "São Paulo, Brasil", R.drawable.examplepeopleprofile, "Lais"),
                        connections("Lucas Amorim", "Santa Catarina, Brasil", R.drawable.ic_profile_placeholder3, ""),
                        connections("Alessandra Luz", "Veneza, Itália", R.drawable.ic_profile_placeholder4, ""),
                        connections("João Silva", "Lisboa, Portugal", R.drawable.ic_profile_placeholder5, ""),
                                connections("Fabio Nascimento", "Paris, França", R.drawable.ic_profile_placeholder, ""),
                    connections("Maria Valentina", "São Paulo, Brasil", R.drawable.ic_profile_placeholder2, ""),
                    connections("Lucas Amorim", "Santa Catarina, Brasil", R.drawable.ic_profile_placeholder3, ""),
                    connections("Alessandra Luz", "Veneza, Itália", R.drawable.ic_profile_placeholder4, ""),
                    connections("João Silva", "Lisboa, Portugal", R.drawable.ic_profile_placeholder5, ""),
                        connections("Fabio Nascimento", "Paris, França", R.drawable.ic_profile_placeholder, ""),
                        connections("Maria Valentina", "São Paulo, Brasil", R.drawable.ic_profile_placeholder2, ""),
                        connections("Lucas Amorim", "Santa Catarina, Brasil", R.drawable.ic_profile_placeholder3, ""),
                        connections("Alessandra Luz", "Veneza, Itália", R.drawable.ic_profile_placeholder4, ""),
                        connections("João Silva", "Lisboa, Portugal", R.drawable.ic_profile_placeholder5, "")
                    )

                    ConnectionsSearchScreen(navController, sampleconnections)
                }
                composable("Lais") {
                    ProfileScreen(navController)
                }
                composable("Fabio") {
                    AzConnectProfileScreen(navController)
                }
                composable("InputFullRegisterScreen") {
                    InputFullRegisterScreen(navController)
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
                composable("SettingsScreen") {
                    SettingsScreen(navController)
                }

            }
        },
        // Adicione a bottomBar apenas quando a rota for "PlanScreenSuggestion"
        bottomBar = {
            if (currentRoute == "ConnectionsSearchScreen") {
                navegationBar(navController)
            }
        }
    )
}

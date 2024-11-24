package com.vooazdomain.Vooaz.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import navegationBar

@Composable
fun PlanSuggestionScreen(navController: NavHostController) {
    BackgroundAirport()

    Box(
        modifier = Modifier.padding(top = 400.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Explore nossos \nplanos!",
                fontSize = 36.sp,
                color = Color(0xFFF4B942),
                fontWeight = FontWeight.Bold,
                maxLines = 2,
                lineHeight = 40.sp
            )

            Button(
                onClick = { navController.navigate("LoginScreen") },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF97D8C4))
            ) {
                Text(
                    "Conhecer Premium",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }

            Text(
                text = "Deixar para depois",
                textDecoration = TextDecoration.Underline,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .clickable { navController.navigate("InputScreen") }
            )
        }
    }
}

@Composable
fun BackgroundAirport() {
    Box(Modifier.fillMaxSize().background(Color(0xFF4059AD)))
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.background_airport),
            contentDescription = "Airport background",
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 200.dp)
        )
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun PlanScreenSuggestionPreview() {
    VooazTheme {
        PlanSuggestionScreen(navController = rememberNavController())
    }
}

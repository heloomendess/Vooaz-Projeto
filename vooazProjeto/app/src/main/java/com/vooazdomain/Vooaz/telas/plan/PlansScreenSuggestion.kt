package com.vooazdomain.Vooaz.telas.plan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import androidx.compose.ui.res.stringResource
import com.vooazdomain.Vooaz.ui.theme.poppinsFontFamily



@Composable
fun PlanSuggestionScreen(navController: NavHostController) {
    val someThemes = MaterialTheme.colorScheme
    BackgroundAirport(someThemes)

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
                text = stringResource(id = R.string.explore_nossos_planos),
                fontSize = 36.sp,
                color = someThemes.onTertiary,
                fontWeight = FontWeight.Bold,
                maxLines = 2,
                lineHeight = 40.sp,
                fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
            )

            Button(
                onClick = { navController.navigate("LoginScreen") },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .size(width = 250.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = someThemes.secondary)
            ) {
                Text(
                    stringResource(id = R.string.conhecer_premium),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = someThemes.onSecondary,
                    fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
                )
            }

            Text(
                text = stringResource(id = R.string.deixar_para_depois),
                textDecoration = TextDecoration.Underline,
                color = someThemes.onSecondaryContainer,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .clickable { navController.navigate("InputScreen") },
                fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
            )
        }
    }
}

@Composable
fun BackgroundAirport(someThemes: ColorScheme) {
    Box(Modifier.fillMaxSize().background(someThemes.onBackground))
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.background_airport),
            contentDescription = stringResource(id = R.string.background_airport_desc),
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

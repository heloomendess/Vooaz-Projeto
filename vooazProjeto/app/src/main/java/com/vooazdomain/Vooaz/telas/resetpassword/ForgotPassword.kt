package com.vooazdomain.Vooaz.telas.resetpassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.poppinsFontFamily

@Composable
fun BackgroundForgotPassword(someThemes: ColorScheme) {
    Box(modifier = Modifier.background(color = someThemes.onBackground).fillMaxSize())
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painterResource(R.drawable.womanforgotpassword),
            contentDescription = stringResource(R.string.woman_forgot_icon),
            modifier = Modifier.height(400.dp).width(300.dp).align(Alignment.TopCenter).padding(top = 70.dp)
        )
    }
}

@Composable
fun ForgotPasswordScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var someThemes = MaterialTheme.colorScheme

    BackgroundForgotPassword(someThemes)
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Icon(
            Icons.Filled.Close,
            contentDescription = stringResource(R.string.voltar),
            modifier = Modifier.size(50.dp).padding(top = 20.dp).clickable { navController.popBackStack() }
        )
    }

    Column(
        modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(top = 230.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            stringResource(R.string.esqueceu_a_senha),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = someThemes.secondary,
            fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
        )
        Text(
            stringResource(R.string.email_instructions),
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 15.dp),
            color = someThemes.onSecondary,
            fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
        )
        Text(
            stringResource(R.string.password_reminder),
            fontSize = 10.sp,
            modifier = Modifier.padding(top = 10.dp),
            color = someThemes.onSecondary,
            fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(290.dp).height(90.dp).padding(top = 30.dp),
            shape = RoundedCornerShape(8.dp),
            leadingIcon = {
                Icon(
                    Icons.Filled.Email,
                    "",
                    tint = someThemes.onTertiary,
                    modifier = Modifier.size(30.dp)
                )
            },
            label = {
                Text(
                    stringResource(R.string.email),
                    fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
                )
            }
        )
        Button(
            onClick = {
                navController.navigate("ForgotPasswordPin")
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(top = 30.dp).width(200.dp).height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = someThemes.onTertiary),
        ) {
            Text(
                stringResource(R.string.enviar_email),
                fontWeight = FontWeight.Bold,
                color = someThemes.onSecondary,
                fontFamily = poppinsFontFamily // Adicionando a fonte Poppins
            )
        }
    }
}

@Preview(showBackground = true, heightDp = 800, widthDp = 360)
@Composable
fun ForgotPasswordPreview() {
    ForgotPasswordScreen(rememberNavController())
}

package com.vooazdomain.Vooaz.telas.inputflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun BackgroundLoginScreen() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFF4059AD))
            .fillMaxSize()
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painterResource(R.drawable.logoaz),
            contentDescription = stringResource(id = R.string.logo),
            modifier = Modifier.size(300.dp),
        )
    }
}

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var senha  by remember { mutableStateOf("") }

    BackgroundLoginScreen()
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Icon(Icons.Filled.Close, contentDescription = stringResource(id = R.string.voltar), modifier = Modifier.size(50.dp).padding(top = 25.dp).clickable { navController.popBackStack() })
    }
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        TextField(
            label = { Text(stringResource(id = R.string.email)) },
            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(310.dp).height(90.dp).padding(top = 30.dp),
            shape = RoundedCornerShape(8.dp),
            leadingIcon = {
                Icon(
                    Icons.Filled.Email,
                    "",
                    tint = Color(0xFFFF9E00),
                    modifier = Modifier.size(30.dp)
                )
            }
        )
        TextField(
            label = { Text(stringResource(id = R.string.senha)) },
            value = senha,
            onValueChange = { senha = it },
            modifier = Modifier.width(310.dp).height(90.dp).padding(top = 30.dp),
            shape = RoundedCornerShape(8.dp),
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = {
                Icon(Icons.Filled.Lock, "", tint = Color(0xFFFF9E00), modifier = Modifier.size(30.dp))
            }
        )
        Text(
            text = stringResource(id = R.string.esqueci_minha_senha),
            fontSize = 12.sp,
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFF9E00),
            modifier = Modifier.padding(end = 170.dp).clickable { navController.navigate("ForgotPassword") }
        )
        Button(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(top = 30.dp).width(310.dp).height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
        ) {
            Text(stringResource(id = R.string.entrar), fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }

        Text(stringResource(id = R.string.ou_faca_login), fontWeight = FontWeight.Bold, color = Color(0xFFF4B942), modifier = Modifier.padding(top = 80.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(painterResource(R.drawable.google), contentDescription = stringResource(id = R.string.google), modifier = Modifier.size(70.dp).padding(end = 30.dp, bottom = 20.dp))
            Image(painterResource(R.drawable.instagram), contentDescription = stringResource(id = R.string.instagram), modifier = Modifier.size(50.dp))
            Image(painterResource(R.drawable.facebook), contentDescription = stringResource(id = R.string.facebook), modifier = Modifier.size(70.dp).padding(start = 30.dp, bottom = 20.dp))
        }
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun LoginPreview() {
    VooazTheme {
        LoginScreen(rememberNavController())
    }
}

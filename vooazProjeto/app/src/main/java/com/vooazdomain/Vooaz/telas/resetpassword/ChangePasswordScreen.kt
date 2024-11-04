package com.vooazdomain.Vooaz.telas.resetpassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.VooazTheme

@Composable
fun BackgroundColorChangePassword() {
    Box(
        modifier = Modifier
            .background(
                color = Color(0xFF4059AD)
            )
            .fillMaxWidth()
            .fillMaxHeight()
    )


}


@Composable
fun IconsVooazChangePasswordScreen() {
    BackgroundColorChangePassword()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painterResource(R.drawable.logoaz),
            contentDescription = "Logo",
            modifier = Modifier.size(350.dp),
        )
    }
}
@Composable
fun ContentChangePasswordScreen(){
    var password by remember { mutableStateOf("")}
    var confirmPassword by remember { mutableStateOf("")}

    var equalsPassword = false
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),

        ){
        Icon(Icons.Filled.Close, contentDescription = "Voltar", modifier = Modifier.size(50.dp).padding(top=10.dp))}
    Column (
        modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

    Text("Crie uma nova senha", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color(0xFFF4B942), modifier = Modifier.padding(bottom = 10.dp))

    TextField(value = password, onValueChange = { password = it }, modifier = Modifier.width(310.dp).height(110.dp).padding(top = 30.dp),  shape = RoundedCornerShape(8.dp), leadingIcon  = {
        Icon(Icons.Filled.Lock,"", tint =Color(0xFFFF9E00), modifier = Modifier.size(30.dp) )
    }, label = {Text("Nova Senha")})

        TextField(value = confirmPassword , onValueChange = { confirmPassword = it }, modifier = Modifier.width(310.dp).height(110.dp).padding(top = 30.dp),  shape = RoundedCornerShape(8.dp), leadingIcon  = {
            Icon(Icons.Filled.Lock,"", tint =Color(0xFFFF9E00), modifier = Modifier.size(30.dp) )
        }, label = {Text("Confirmar Senha")})

        Button( onClick ={},
            shape =   RoundedCornerShape(20.dp),
            modifier = Modifier.padding(top = 30.dp).width(200.dp).height(50.dp),
            colors =  ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
        ) {
            Text("Resetar Senha", fontWeight = FontWeight.Bold, color =  Color.White)
        }
}
}
@Composable
fun ChangePasswordScreen(navController: NavController) {
    VooazTheme {
        IconsVooazChangePasswordScreen()
        ContentChangePasswordScreen()


    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun ChangePasswordScreenPreview() {
    VooazTheme {

        IconsVooazChangePasswordScreen()
        ContentChangePasswordScreen()

    }
}
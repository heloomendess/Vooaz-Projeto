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
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R


@Composable
fun BackgroundForgotPassword(){
    Box(modifier = Modifier.background(color = Color(0xFF2C58B0)).fillMaxSize())
    Box(
        modifier = Modifier.fillMaxSize(),


    ){
        Image(painterResource(R.drawable.womanforgotpassword), contentDescription = "Woman forgot password image", modifier = Modifier.height(400.dp).width(300.dp).align(Alignment.TopCenter).padding(top= 70.dp))
    }
}

@Composable
fun ForgotPasswordScreen(navController: NavController){
    var email by remember { mutableStateOf("")}

    BackgroundForgotPassword()
    Box(
        modifier = Modifier.fillMaxSize(),

    ){
        Icon(Icons.Filled.Close, contentDescription = "Voltar", modifier = Modifier.size(50.dp).padding(top=20.dp).clickable { navController.popBackStack() })}

    Column(
    modifier= Modifier.fillMaxHeight().fillMaxWidth().padding(top=230.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
    Text("Esqueceu a senha?", fontSize = 30.sp, fontWeight = FontWeight.Bold, color= Color(color = 0xFF97D8C4))
        Text("• Entre com o seu email para verificar sua identidade", fontSize = 12.sp, modifier = Modifier.padding(top = 15.dp))
        Text("• Sempre que possivel anote a senha a qual voce digitou", fontSize= 10.sp, modifier = Modifier.padding(top = 10.dp))
        TextField(value = email, onValueChange = {email = it}, modifier = Modifier.width(290.dp).height(90.dp).padding(top = 30.dp),  shape = RoundedCornerShape(8.dp), leadingIcon  = {
           Icon(Icons.Filled.Email,"", tint =Color(0xFFFF9E00), modifier = Modifier.size(30.dp) )
        }
        )
        Button( onClick = {

            navController.navigate("ForgotPasswordPin")
        },
            shape =   RoundedCornerShape(20.dp),
            modifier = Modifier.padding(top = 30.dp).width(200.dp).height(50.dp),
            colors =  ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
        ) {
            Text("Enviar Email", fontWeight = FontWeight.Bold)
        }



    }

}
@Preview(showBackground = true, heightDp = 800, widthDp = 360)
@Composable
fun ForgotPasswordPreview(){
    ForgotPasswordScreen(rememberNavController())

}
package com.vooazdomain.Vooaz.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vooazdomain.Vooaz.R


@Composable
fun BackgroundColorRegisterAccountScreen() {
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
fun RegisterAccountContent(navController: NavController){
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password  by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(true) }
    BackgroundColorRegisterAccountScreen()
Box(){
    Icon(Icons.Filled.Close, contentDescription = "Voltar", modifier = Modifier.size(70.dp).padding(top=25.dp).clickable { navController.popBackStack() })
}
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 15.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Criar conta usando:", fontSize = 18.sp, color = Color(0xFFF4B942), fontWeight = FontWeight.Bold)
        }
        Row(
            modifier = Modifier.padding(bottom = 15.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {

            Image(
                painterResource(R.drawable.google),
                contentDescription = "Google logo",
                modifier = Modifier.size(60.dp).padding(end = 20.dp, bottom = 20.dp)
            )
            Image(
                painterResource(R.drawable.instagram),
                contentDescription = "Instagram logo",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painterResource(R.drawable.facebook),
                contentDescription = "Facebook logo",
                modifier = Modifier.size(60.dp).padding(start = 30.dp, bottom = 20.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(" -- ou então --", fontSize = 18.sp, color = Color(0xFFF4B942), fontWeight = FontWeight.Bold)
        }

        Column ( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                "Nome",
                color = Color(0xFFF4B942),
                modifier = Modifier.align(Alignment.Start).padding(start = 40.dp, top = 20.dp, bottom = 2.dp)
            )

            TextField(

                value = name,
                onValueChange = { name = it },
                modifier = Modifier.width(310.dp).height(50.dp),
                shape = RoundedCornerShape(8.dp),
                leadingIcon = {
                    Icon(
                        Icons.Filled.Person,
                        "",
                        tint = Color(0xFFFF9E00),
                        modifier = Modifier.size(30.dp)
                    )
                },)


                Text(
                    "Email",
                    color = Color(0xFFF4B942),
                modifier = Modifier.align(Alignment.Start).padding(start = 40.dp, top = 20.dp, bottom = 2.dp)
                )

                TextField(

            value = email,
            onValueChange = { email = it },
            modifier = Modifier.width(310.dp).height(50.dp),
            shape = RoundedCornerShape(8.dp),
            leadingIcon = {
                Icon(
                    Icons.Filled.Email,
                    "",
                    tint = Color(0xFFFF9E00),
                    modifier = Modifier.size(30.dp)
                )
            },)
            Text(
                "Senha",
                color = Color(0xFFF4B942),
                modifier = Modifier.align(Alignment.Start).padding(start = 40.dp, top = 20.dp, bottom = 2.dp)
            )
        TextField(value = password , onValueChange = { password = it }, modifier = Modifier.width(310.dp).height(50.dp),  shape = RoundedCornerShape(8.dp), visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password), leadingIcon  = {
                Icon(Icons.Filled.Lock,"", tint =Color(0xFFFF9E00), modifier = Modifier.size(30.dp) )
            })
            Column (
                modifier = Modifier.padding(top=30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 20.dp, start = 5.dp)
                ) {
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { checked = it }
                    )
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                SpanStyle(
                                    color = Color(0xFFF4B942)
                                )
                            ) {
                                append("Ao criar uma conta, você concorda com nossos ")
                            }
                            append("Termos de Uso")
                            withStyle(SpanStyle(color = Color(0xFFF4B942))){
                                append("e nossa ")
                            }
                            append("Política de Privacidade")
                        }
                    )


                }
                Button( onClick = {},
                    shape =   RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(top = 10.dp).width(310.dp).height(50.dp),
                    colors =  ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
                ) {
                    Text("Entrar", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
            }
    }
}
    }


@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun ResgisterAccountPreview(){
    RegisterAccountContent(rememberNavController())
}
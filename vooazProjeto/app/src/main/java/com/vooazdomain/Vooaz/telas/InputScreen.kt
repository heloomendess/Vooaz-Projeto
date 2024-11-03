package com.vooazdomain.Vooaz.telas


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxHeight

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.ui.theme.VooazTheme

@Composable
fun BackgroundColor() {
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
fun InputChoicesButtom() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(300.dp)
                .height(90.dp).padding(bottom = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0E2C8F)),
            shape = RoundedCornerShape(20.dp),
        ) {
            Text("Cadastro", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(300.dp)
                .height(90.dp)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Login", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        }
    }
}

@Composable
fun IconsVooaz() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painterResource(R.drawable.logoaz),
            contentDescription = "Logo",
            modifier = Modifier.size(400.dp),
        )
    }
}
@Composable
fun ButtomText(){
    Row (modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(bottom = 40.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center) {
        Row {
            Text("Conheça um pouco mais ", fontWeight = FontWeight.Bold)

            Text("sobre nós.", color = Color(0xFFF4B942), fontWeight = FontWeight.Bold)
        }


    }
}

@Composable
fun InputScreen() {
    VooazTheme {
        BackgroundColor()
        IconsVooaz()
        InputChoicesButtom()
        ButtomText()
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun InputScreenPreview() {
    VooazTheme {
        InputScreen()
        IconsVooaz()
        InputChoicesButtom()
        ButtomText()
    }
}
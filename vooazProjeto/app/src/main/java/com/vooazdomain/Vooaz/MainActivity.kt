package com.vooazdomain.Vooaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { true }
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000L)

            splashScreen.setKeepOnScreenCondition { false }
        }
        setContent {
            VooazTheme() {
                    BackgroundAirport()
                ContentChoices()

            }
        }
    }
}
@Composable
fun ContentChoices(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(top = 400.dp, end = 50.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Explore nossos \nplanos!", fontSize = 36.sp, color = Color(0xFFF4B942), fontWeight = FontWeight.Bold, maxLines = 2, lineHeight = 40.sp)
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .padding(top = 20.dp, start = 50.dp)
            .size(width = 250.dp, height = 50.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF97D8C4))){
            Text("conhecer Premium", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }
        Text(text = "Deixar para depois", textDecoration = TextDecoration.Underline, color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp, start = 40.dp))
    }
}
@Composable
fun BackgroundAirport(

) {

    Column(
        modifier = Modifier.background(Color(0xFF0E2C8F))
    ) {


        Image(
            painter = painterResource(R.drawable.background_airport),
            contentDescription = "Airport image to background ",
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 200.dp)

            )
    }
  
}


@Preview(showBackground = true, widthDp = 390, heightDp = 800 )
@Composable
fun GreetingPreview() {
    VooazTheme {
        BackgroundAirport()
    }
}
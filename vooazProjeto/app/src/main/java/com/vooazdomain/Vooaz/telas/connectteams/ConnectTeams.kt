package com.vooazdomain.Vooaz.telas.connectteams

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vooazdomain.Vooaz.R

@Composable
fun ConfirmationScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize().background(Color(0xFFDADADA)) // Fundo cinza claro (ajustado para mais fidelidade)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            // Substituindo o Card por um Box
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f) // Largura ajustada
                    .height(400.dp) // Altura ajustada
                    .border(
                        width = 2.dp, // Espessura da borda
                        color = Color.Black, // Cor da borda
                        shape = RoundedCornerShape(16.dp) // Bordas arredondadas
                    )
                    .padding(1.dp) // Espaçamento interno
                    .background(Color(0xFFF9F9F9), shape = RoundedCornerShape(16.dp)) // Fundo branco suave com bordas arredondadas
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 15.dp, horizontal = 7.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Logo
                    Image(
                        painter = painterResource(id = R.drawable.logoaz),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .size(180.dp),
                        contentScale = ContentScale.Fit
                    )

                    Text(
                        text = "Tudo Certo!!",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Nossa equipe entrara em contato em breve para confirmar seus dados fique atento ao seu email.",
                        style = TextStyle(
                            fontSize = 20.sp,
                            lineHeight = 19.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                            textAlign = TextAlign.Center,

                        ),
                        modifier = Modifier.padding(bottom = 20.dp)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun ConfirmationScreenPreview() {
    ConfirmationScreen()
}

package com.vooazdomain.Vooaz.telas.paymentflow

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
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
import com.vooazdomain.Vooaz.telas.plan.poppinsFontFamily
import com.vooazdomain.Vooaz.ui.theme.VooazTheme
import androidx.compose.ui.res.stringResource


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PagamentoFeito(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFF0E2C8F),
        topBar = {
            TopAppBar(
                title = { Text(text = "") },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFF0E2C8F)),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Image(
                            painter = painterResource(id = R.drawable.arrowback),
                            contentDescription = stringResource(id = R.string.voltar),
                            modifier = Modifier.size(50.dp)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Image(
                            painter = painterResource(id = R.drawable.close),
                            contentDescription = stringResource(id = R.string.fechar),
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pagamento_feito),
                    contentDescription = stringResource(id = R.string.pagamento_feito_desc),
                    modifier = Modifier
                        .size(455.dp)
                        .padding(
                            top = 0.dp,
                            bottom = 40.dp
                        )
                )
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFF4B942),
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(30.dp),
                    border = androidx.compose.foundation.BorderStroke(2.dp, Color.Black),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(
                            top = 60.dp,
                            bottom = 0.dp
                        )
                ) {
                    Text(
                        text = stringResource(id = R.string.entrar),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFontFamily,
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800 )
@Composable
fun PagamentoFeitoPreview() {
    VooazTheme {
        PagamentoFeito(rememberNavController())
    }
}

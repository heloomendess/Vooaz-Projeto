package com.example.telavooaz

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telavooaz.ui.theme.TelaVooazTheme

val poppinsFontFamily = FontFamily(
    Font(R.font.poppinsregular, FontWeight.Normal),
    Font(R.font.poppinsbold, FontWeight.Bold)
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Pagamento(modifier: Modifier = Modifier) {
    val nome = remember { mutableStateOf("") }
    val numeroCartao = remember { mutableStateOf("") }
    val dataExpedicao = remember { mutableStateOf("") }
    val cvc = remember { mutableStateOf("") }
    val cpfcnpj = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }

    val selectedPais = remember { mutableStateOf("") }
    val expanded = remember { mutableStateOf(false) }
    val paises = listOf("Brasil", "United States", "Portugal", "日本", "Россия")

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
                            contentDescription = "Voltar",
                            modifier = Modifier.size(50.dp)
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Image(
                            painter = painterResource(id = R.drawable.close),
                            contentDescription = "Fechar",
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Tela de",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = Color(0xFFF4B942),
                    modifier = Modifier.padding(top = 16.dp),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Pagamento",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    color = Color(0xFFF4B942),
                    modifier = Modifier.padding(top = 0.dp),
                    textAlign = TextAlign.Center
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 14.dp, vertical = 20.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Nome Completo do Titular",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFF4B942),
                        modifier = Modifier.padding(bottom = 0.dp)
                    )
                    OutlinedTextField(
                        value = nome.value,
                        onValueChange = { nome.value = it },
                        label = { Text("Nome Completo do Titular") },
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.user_icon),
                                contentDescription = "Imagem de Usuário",
                                modifier = Modifier.size(24.dp),
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedTextColor = Color.Black,
                            focusedBorderColor = Color(0xFFF4B942),
                            unfocusedBorderColor = Color(0xFFC7C7C7)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "Número do Cartão",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFF4B942),
                        modifier = Modifier.padding(top = 15.dp, bottom = 0.dp)
                    )
                    OutlinedTextField(
                        value = numeroCartao.value,
                        onValueChange = { numeroCartao.value = it },
                        label = { Text("Número do Cartão") },
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.icon_cartao),
                                contentDescription = "Imagem de Cartão",
                                modifier = Modifier.size(24.dp),
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedTextColor = Color.Black,
                            focusedBorderColor = Color(0xFFF4B942),
                            unfocusedBorderColor = Color(0xFFC7C7C7)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 6.dp, vertical = 0.dp),
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(horizontal = 10.dp),
                            horizontalAlignment = Alignment.Start
                        ) {

                            Text(
                                text = "Data de Expedição",
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color(0xFFF4B942),
                                modifier = Modifier.padding(top = 15.dp, bottom = 0.dp)
                            )

                            OutlinedTextField(
                                value = dataExpedicao.value,
                                onValueChange = { dataExpedicao.value = it },
                                label = { Text("MM/AA") },
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(id = R.drawable.calendario),
                                        contentDescription = "Expira",
                                        modifier = Modifier.size(24.dp),
                                    )
                                },
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    containerColor = Color.White,
                                    focusedTextColor = Color.Black,
                                    focusedBorderColor = Color(0xFFF4B942),
                                    unfocusedBorderColor = Color(0xFFC7C7C7)
                                ),
                                modifier = Modifier
                                    .width(150.dp)
                                    .padding(top = 0.dp)
                            )

                        }

                        Column(
                            modifier = Modifier
                                .padding(horizontal = 5.dp),
                            horizontalAlignment = Alignment.End
                        ) {

                            Text(
                                text = "Codigo de Segurança",
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,
                                color = Color(0xFFF4B942),
                                modifier = Modifier.padding(top = 15.dp, bottom = 0.dp)
                            )

                            OutlinedTextField(
                                value = cvc.value,
                                onValueChange = { cvc.value = it },
                                label = { Text("CVC") },
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(id = R.drawable.cvc),
                                        contentDescription = "CVC",
                                        modifier = Modifier.size(24.dp),
                                    )
                                },
                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    containerColor = Color.White,
                                    focusedTextColor = Color.Black,
                                    focusedBorderColor = Color(0xFFF4B942),
                                    unfocusedBorderColor = Color(0xFFC7C7C7)
                                ),
                                modifier = Modifier
                                    .width(150.dp)
                                    .padding(top = 0.dp)
                            )

                        }
                    }

                    Text(
                        text = "CPF/CNPJ",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFF4B942),
                        modifier = Modifier.padding(top = 15.dp, bottom = 4.dp)
                    )
                    OutlinedTextField(
                        value = cpfcnpj.value,
                        onValueChange = { cpfcnpj.value = it },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedTextColor = Color.Black,
                            focusedBorderColor = Color(0xFFF4B942),
                            unfocusedBorderColor = Color(0xFFC7C7C7)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = "Endereço de Email",
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFF4B942),
                        modifier = Modifier.padding(top = 15.dp, bottom = 0.dp)
                    )
                    OutlinedTextField(
                        value = email.value,
                        onValueChange = { email.value = it },
                        label = { Text("Endereço de Email") },
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = "Email",
                                modifier = Modifier.size(24.dp),
                            )
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedTextColor = Color.Black,
                            focusedBorderColor = Color(0xFFF4B942),
                            unfocusedBorderColor = Color(0xFFC7C7C7)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    OutlinedTextField(
                        value = selectedPais.value,
                        onValueChange = {},
                        label = { Text("Selecione um País") },
                        leadingIcon = {
                            Image(
                                painter = painterResource(id = R.drawable.mundo),
                                contentDescription = "Imagem Fixa",
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        trailingIcon = {
                            IconButton(onClick = { expanded.value = !expanded.value }) {
                                Image(
                                    painter = painterResource(id = if (expanded.value) R.drawable.flecha_cima else R.drawable.flecha_baixo),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            containerColor = Color.White,
                            focusedTextColor = Color.Black,
                            focusedBorderColor = Color(0xFFF4B942),
                            unfocusedBorderColor = Color(0xFFC7C7C7)
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )
                    DropdownMenu(
                        expanded = expanded.value,
                        onDismissRequest = { expanded.value = false },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        paises.forEach { name ->
                            DropdownMenuItem(
                                text = { Text(name) },
                                onClick = {
                                    selectedPais.value = name
                                    expanded.value = false
                                }
                            )
                        }
                    }

                }
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun PagamentoPreview() {
    Pagamento()
}

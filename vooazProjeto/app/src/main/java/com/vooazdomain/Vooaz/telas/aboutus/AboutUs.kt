package com.vooazdomain.Vooaz.telas.aboutus

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.vooazdomain.Vooaz.ui.theme.poppinsFontFamily
import com.vooazdomain.Vooaz.ui.theme.white
import com.vooazdomain.Vooaz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutUsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Sobre Nós",
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* Ação ao voltar */ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.onBackground)
            )
        },
        containerColor = MaterialTheme.colorScheme.primary
    ) { innerpadding->

        Column(
            modifier = Modifier
                .fillMaxWidth().verticalScroll(rememberScrollState())
                .padding(innerpadding),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier = Modifier
                    .border(width = 2.dp, color =MaterialTheme.colorScheme.onBackground, shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd = 50.dp))
                .width(346.dp)
                .height(90.dp)
                .background(color = MaterialTheme.colorScheme.background, shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd = 50.dp))
, contentAlignment = Alignment.Center) {
                Text(
                    text = "Voe mais alto\n       com o Vooaz",
                    style = TextStyle(
                        fontSize = 30.sp,
                        lineHeight = 30.sp,
                        fontWeight = FontWeight(900),
                        color = MaterialTheme.colorScheme.tertiary),
                    )

            }

            // Conteúdo principal

                // Primeiro Card
                Card(
                        modifier = Modifier.background(MaterialTheme.colorScheme.secondary, shape =RoundedCornerShape(12.dp)).border(2.dp, MaterialTheme.colorScheme.onSecondary, shape =RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiary),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                    ) {

                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "A monetização do Vooaz será reallizada através de Afiliação de viagens. Empresas parceiras divulgam seus serviços em nosso app.",
                            style = TextStyle(
                                fontSize = 21.sp,
                                lineHeight = 31.sp,

                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSecondary,
                            )
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ico_money),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp).align(Alignment.End)
                        )
                    }
                }

                // Segundo Card
                Card(
                    modifier = Modifier.background(MaterialTheme.colorScheme.secondary, shape =RoundedCornerShape(12.dp)).border(2.dp, MaterialTheme.colorScheme.onSecondary, shape =RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiary),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ico_emoji_thinking),
                                contentDescription = null,
                                modifier = Modifier.size(60.dp).padding(10.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Como isso\nvai funcionar?",
                                fontFamily = poppinsFontFamily,
                                color = MaterialTheme.colorScheme.onTertiary,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Ao explorar seu destino no nosso app, você encontrará pacotes das nossas empresas parceiras. Escolha entre pacotes completos ou serviços isolados e, ao clicar, será redirecionado ao site da empresa para finalizar a compra. Recebemos uma porcentagem do valor pago como parte do nosso serviço de conexão.",
                            style = TextStyle(
                                fontSize = 24.sp,
                                lineHeight = 31.32.sp,
                                fontWeight = FontWeight(500),
                                color = MaterialTheme.colorScheme.onSecondary,
                            )
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ico_intecall_peoples),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp).align(Alignment.End)
                        )
                    }
                }
            }
        }
    }
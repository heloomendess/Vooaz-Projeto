import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.vooazdomain.Vooaz.R
import com.vooazdomain.Vooaz.telas.destinationsScreen.TravelItineraryScreen

@Composable
fun DestinationDetailsScreen(
    imageRes: Int,
    title: String,
    website: String,
    address: String,
    phone: String,
    hours: String,
    rating: Float,
    reviewsCount: Int,
    description: String,
    userComments: List<UserComment>,
    onVisitClick: () -> Unit,
    expandRouteTravel: MutableState<Boolean> = remember { mutableStateOf(false) },
            expanded_hours: MutableState<Boolean> = remember { mutableStateOf(false) },
) {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFF7F7F7))) {
        Box() {
            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                contentScale = ContentScale.Crop
            )
        }
        // Conteúdo principal
        if (!expandRouteTravel.value){
        Column(
            modifier = Modifier
                .fillMaxWidth().verticalScroll(rememberScrollState())
                .padding(start = 16.dp, end = 16.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(modifier = Modifier
                .width(240.dp)
                .height(55.dp)
                .background(color = Color(0xFFF4B942), shape = RoundedCornerShape(size = 20.dp)).clickable {
                }, contentAlignment = Alignment.Center) {
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White

                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )}


Box(modifier =Modifier.padding(top = 10.dp).border(2.dp, Color.Gray, shape = RoundedCornerShape(size = 20.dp)).fillMaxWidth()) {
    Box(modifier = Modifier.padding(20.dp)) {
        Column {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = website,
                color = Color(0xFF1E88E5),
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = address)
            Text(text = "Telefone: $phone")
            Text(text = "Horários: $hours")
            Box(modifier = Modifier.fillMaxWidth().clickable {
                expanded_hours.value =!expanded_hours.value
            }, contentAlignment = Alignment.Center) {
                Icon(

                    imageVector = if (expanded_hours.value) {
                        Icons.Default.KeyboardArrowUp
                    } else {
                        Icons.Default.KeyboardArrowDown
                    }, contentDescription = "seta", modifier = Modifier.size(30.dp)
                )
            }
        }

    }
}
   if (expanded_hours.value) {
       Box(
           modifier = Modifier.padding(top = 10.dp)
               .border(2.dp, Color.Gray, shape = RoundedCornerShape(size = 20.dp)).fillMaxWidth()
       ) {
           Box(modifier = Modifier.padding(20.dp)) {
               Row {
                   Text(
                       text = "Terça-feira: 09:00 - 16:00\nQuarta-feira: 09:00 - 16:00\nQuinta-feira: 09:00 - 16:00\nSexta-feira: 09:00 - 16:00\nSábado: 09:00 - 16:00\nDomingo: 13:00 - 16:00\nSegunda-feira: 09:00 - 16:00",
                       style = TextStyle(
                           fontSize = 12.sp,
                           fontWeight = FontWeight(700),
                           color = Color(0xFF000000),
                       )
                   )


               }
           }
       }
   }
            Spacer(modifier = Modifier.height(8.dp))

            Box(modifier =Modifier.border(2.dp, Color.Gray, shape = RoundedCornerShape(size = 20.dp)).fillMaxWidth()) {
                Box(modifier = Modifier.padding(10.dp)) {// Informações principais
                    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
                        Text("Avaliações")
                        Image(painterResource(R.drawable.ico_coruja) ,contentDescription = "empresa", modifier = Modifier.size(80.dp))
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "4/5\nTripadvisor\n(364 avaliações)",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF000000),
                                textAlign = TextAlign.Center,
                                textDecoration = TextDecoration.Underline,
                            )
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Box(modifier =Modifier.border(2.dp, Color.Gray, shape = RoundedCornerShape(size = 20.dp)).fillMaxWidth()) {
                Box(modifier = Modifier.padding(10.dp)) {// Informações principais
                    Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){


                        Text(
                            text = description,
                            modifier =Modifier.padding(10.dp),
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFF000000),
                                textAlign = TextAlign.Center,
                                textDecoration = TextDecoration.Underline,
                            )
                        )

                    }
                }
            }


            // Comentários dos usuários
            Spacer(modifier = Modifier.height(24.dp))
            UserCommentsSection(userComments)

            // Botão para ação
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    expandRouteTravel.value = !expandRouteTravel.value
                },
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 20.dp))
                    .width(192.dp)
                    .height(44.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3B5998)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Roteiro")
            }
            Spacer(modifier = Modifier.height(14.dp))

            Button(
                onClick = onVisitClick,
                modifier = Modifier
                    .border(width = 1.dp, color = Color(0xFF000000), shape = RoundedCornerShape(size = 20.dp))
                .width(272.dp)
                .height(54.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Realizar visita")
            }
        }
    } else {

    TravelItineraryScreen(expandRouteTravel)
}
}
}
@Composable
fun RatingSection(rating: Float, reviewsCount: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null,
            modifier = Modifier.size(32.dp),
            tint = Color(0xFFFFC107) // Cor da estrela (amarela)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "$rating/5"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "($reviewsCount avaliações)",
            color = Color.Gray
        )
    }
}

@Composable
fun UserCommentsSection(comments: List<UserComment>) {
    Text(
        text = "Comentario dos Usuarios",
        style = TextStyle(
            fontSize = 20.sp,
            lineHeight = 27.37.sp,
            fontWeight = FontWeight(900),
            color = Color(0xFF000000),
            textAlign = TextAlign.Center,
        )
    )
    Spacer(modifier = Modifier.height(8.dp))
    comments.forEach { comment ->
        UserCommentItem(comment)
        Spacer(modifier = Modifier.height(12.dp))
    }
}

@Composable
fun UserCommentItem(comment: UserComment) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, Color(0xFFDDDDDD), RoundedCornerShape(8.dp))
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.Top
    ) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            tint = Color.Gray
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = comment.userName
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = Color(0xFFFFC107)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = comment.rating.toString(),
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = comment.comment,
                color = Color(0xFF555555))

        }
    }
}

// Modelo de dados para comentários
data class UserComment(
    val userName: String,
    val rating: Float,
    val comment: String
)

@Preview(showBackground = true)
@Composable
fun PreviewDestinationDetails() {
    DestinationDetailsScreen(
        imageRes = R.drawable.museuimg,
        title = "Museu do Ipiranga",
        website = "museudoipiranga.org.br",
        address = "Parque da Independência - Ipiranga, São Paulo - SP, 04263-000",
        phone = "(11) 2065-8000",
        hours = "10:00 – 17:00",
        rating = 4.8f,
        reviewsCount = 512,
        description = "O Museu do Ipiranga em São Paulo reabriu recentemente após uma reforma, apresentando artefatos que narram a história do Brasil, com ênfase na Independência. A arquitetura grandiosa, inspirada no Palácio de Versalhes, é uma atração imperdível.",
        userComments = listOf(
            UserComment(
                userName = "Caroline Amaral",
                rating = 4.5f,
                comment = "Visitei o Museu do Ipiranga e adorei! O acervo é muito interessante e a estrutura está linda após a reforma. Recomendo a todos que gostam de história!"
            ),
            UserComment(
                userName = "José Ferreira",
                rating = 4.0f,
                comment = "Excelente visita ao Museu do Ipiranga! As exposições são bem organizadas e a história do Brasil ganha vida ali. Vale a pena conhecer!"
            )
        ),
        onVisitClick = { /* Ação para realizar a visita */ }
    )
}



package com.vooazdomain.Vooaz.telas.destinationsScreen

import DestinationDetailsScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TravelItineraryScreen(expanded_Travel: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFFF7F5F5))
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Mini roteiro:",

            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Duração: Aprox. 3–4 horas",
            color = Color.Gray,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TravelStep(
            title = "Chegada",
            time = "10h",
            description = "Transporte: A combinar com o guia ou uso de transporte público. Se optar por carro, verificar opções de estacionamento."
        )
        TravelStep(
            title = "Entrada",
            time = "10h15",
            description = "Dica: Informe-se sobre acessibilidade na bilheteria, como guias ou audioguias adaptados."
        )
        TravelStep(
            title = "Visita às Exposições",
            time = "10h30",
            description = "Atividades: Explore salas e exposições. Não perca a sala 'Grito do Ipiranga' e itens históricos.",
            duration = "1h30"
        )
        TravelStep(
            title = "Pausa para Café",
            time = "12h00",
            description = "Local: Café do Museu. Duração: 30 min."
        )
        TravelStep(
            title = "Passeio pelos Jardins",
            time = "12h30",
            description = "Atividades: Aproveite os jardins para tirar fotos.",
            duration = "30 min"
        )
        TravelStep(
            title = "Visita à Loja de Souvenirs",
            time = "13h00",
            description = "Atividades: Confira itens relacionados ao museu e à história do Brasil.",
            duration = "30 min"
        )
        Divider(modifier = Modifier.padding(vertical = 16.dp))
        AdditionalTips()
        Spacer(modifier = Modifier.weight(1f))
        Button (
            onClick = { expanded_Travel.value = !expanded_Travel.value },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4B942))
        ) {
            Text("Sair do Modo Roteiro")
        }
    }
}

@Composable
fun TravelStep(title: String, time: String, description: String, duration: String? = null) {
    Column(modifier = Modifier.padding(bottom = 16.dp)) {
        Text(
            text = title,
        )
        Row (verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.LocationOn, contentDescription = null, tint = Color.Gray)
            Text(
                text = "Horário: $time",
                modifier = Modifier.padding(start = 4.dp)
            )
        }
        if (duration != null) {
            Text(
                text = "Duração: $duration",
                color = Color.Gray,
                modifier = Modifier.padding(top = 2.dp)
            )
        }
        Text(
            text = description,
            
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun AdditionalTips() {
    Column {
        Text(
            text = "Dicas Adicionais",
        )
        Text(
            text = "Planejamento: Entre em contato com o museu para verificar recursos disponíveis.",

            modifier = Modifier.padding(top = 4.dp)
        )
        Text(
            text = "Acompanhante: Esteja acompanhado para melhor navegação.",

            modifier = Modifier.padding(top = 4.dp)
        )   
        Text(
            text = "Material tátil: Pergunte por materiais táteis ou experiências sensoriais.",
            
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

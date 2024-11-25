package com.vooazdomain.Vooaz.modelsData.constantsData

import com.vooazdomain.Vooaz.modelsData.datas.Plans


object PlansConstant {
 val Plans = listOf(

     Plans(
         planId = 1,
         planName = "Voo Inicial",
         monthlyFee = 0.0,
         annualFee = 0.0,
         benefits = listOf("Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade")
     ),
     Plans(
         planId = 2,
         planName = "Explorador",
         monthlyFee = 400.0,
         annualFee = 500.0,
         benefits = listOf("Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade", "Az Conecta", "Onibus de viagem")
     )
 )
}
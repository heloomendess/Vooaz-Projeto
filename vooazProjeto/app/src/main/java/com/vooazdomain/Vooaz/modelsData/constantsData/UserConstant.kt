package com.vooazdomain.Vooaz.modelsData.constantsData

import com.vooazdomain.Vooaz.modelsData.datas.User
import java.util.Date

var initialFlightPlan = PlansConstant.Plans.get(0)
var explorerPlan = PlansConstant.Plans.get(1)

object UsersConts {
    val users = listOf(
        User(
            userId = 1,
            name = "Danilo de Santana Alcantara",
            email = "danilo.alcantara.2003y@email.com",
            password = "DaniloAlcantara",
            disabilityType = "Visual",
            birthDate = Date("2003/11/26"),
            userPlans = explorerPlan
        ),
        User(
            userId = 2,
            name = "Larissa Mendes",
            email = "larissa.mendes@email.com",
            password = "hash_senha_456",
            disabilityType = "Auditiva",
            birthDate = Date("1989/11/20"),
            userPlans = initialFlightPlan
        ),
        User(
            userId = 3,
            name = "Eduardo Lima",
            email = "eduardo.lima@email.com",
            password = "hash_senha_789",
            disabilityType = "Visual e Auditiva",
            birthDate = Date("2002/02/03"),
            userPlans = initialFlightPlan
        ),
        User(
            userId = 4,
            name = "Mariana Costa",
            email = "mariana.costa@email.com",
            password = "hash_senha_101",
            disabilityType = "Visual",
            birthDate = Date("1990/07/22"),
            userPlans = initialFlightPlan
        ),
        User(
            userId = 5,
            name = "Felipe Andrade",
            email = "felipe.andrade@email.com",
            password = "hash_senha_202",
            disabilityType = "Auditiva",
            birthDate = Date("1998/09/10"),
            userPlans = initialFlightPlan
        ),
        User(
            userId = 6,
            name = "Mariana Rodrigues de Paiva",
            email = "marianapaiva@gmail.com",
            password = "mary@Paiva23",
            disabilityType = "Auditiva",
            birthDate = Date("2003/08/05"),
            userPlans = explorerPlan
        ),
        User(
            userId = 7,
            name = "Emanuel Magno Cabral",
            email = "emanuelmcabral@gmail.com",
            password = "magno@2708",
            disabilityType = "Visual",
            birthDate = Date("2001/07/03"),
            userPlans = explorerPlan
        ),
        User(
            userId = 8,
            name = "Gabriel Carvalho de Moraes",
            email = "carvalhogabriel@gmail.com",
            password = "moraesgabs@2805",
            disabilityType = "Auditiva",
            birthDate = Date("1998/05/26"),
            userPlans = explorerPlan
        ),
        User(
            userId = 9,
            name = "Aline Ribeiro Rodrigues",
            email = "lineribeiro02@gmail.com",
            password = "alirodri3012",
            disabilityType = "Visual",
            birthDate = Date("2004/02/31"),
            userPlans = explorerPlan
        ),
        User(
            userId = 10,
            name = "João da Silva Carvalho",
            email = "joãosilva304@gail.com",
            password = "silva@4098",
            disabilityType = "Auditiva",
            birthDate = Date("1997/10/27"),
            userPlans = initialFlightPlan
        ),
        User(
            userId = 11,
            name = "Pietro Monteiro Albuquerque",
            email = "pietromc2023@gmail.com",
            password = "mcpietro4049",
            disabilityType = "Auditiva e Visual",
            birthDate = Date("1998/03/24"),
            userPlans = initialFlightPlan
        )
    )
}

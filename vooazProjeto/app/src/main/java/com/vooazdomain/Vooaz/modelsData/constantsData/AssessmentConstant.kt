package com.vooazdomain.Vooaz.modelsData.constantsData

import com.vooazdomain.Vooaz.modelsData.datas.Assessment
import java.util.Date

var users = UsersConts.users
var touristguides = TouristGuides.guides
var destinations = Destination.destinations

object assessmentConstants {
    val assessment = listOf(
        Assessment(
            userId = users.get(0).userId,
            guideId = touristguides.get(0).tourismGuideId,
            destinationId = destinations.get(0).destinationId,
            rating = 10,
            comments = "Good choice",
            date = Date(2003)
        )
    )
}

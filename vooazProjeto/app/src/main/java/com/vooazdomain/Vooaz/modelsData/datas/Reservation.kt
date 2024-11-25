package com.vooazdomain.Vooaz.modelsData.datas

import java.util.Date

data class Reservation(
    val userId: Int,
    val guideId: Int,
    val destinationId: Int,
    val planId: Int,
    val reservationDate: Date
)
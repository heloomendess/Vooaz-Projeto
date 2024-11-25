package com.vooazdomain.Vooaz.modelsData.datas

import android.media.Rating
import java.util.Date

data class Assessment(
    val userId: Int,
    val guideId: Int,
    val destinationId: Int,
    val rating: Int,
    val comments: String,
    val date: Date
)

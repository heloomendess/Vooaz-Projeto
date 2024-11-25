package com.vooazdomain.Vooaz.modelsData.datas

data class TourismGuide(
    val tourismGuideId: Int,
    val name: String,
    val specialty: String,
    val country: String,
    val state: String,
    val city: String,
    val neighborhood: String,
    val languages: List<String>,
    val rating: Double,
    val email: String,
    val contact: String,
    val type: String,
    val disabilitySpecialty: String
)

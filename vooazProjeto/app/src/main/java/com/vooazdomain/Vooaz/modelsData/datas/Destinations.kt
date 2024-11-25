package com.vooazdomain.Vooaz.modelsData.datas

data class Destinations(
    val destinationId: Int,
    val name: String,
    val category: String,
    val location: String,
    val city: String,
    val state: String,
    val country: String,
    val description: String,
    val accessibility: Acessibilidade
)

data class Acessibilidade(
    val VisualImpairment: Boolean,
    val HearingImpairment: Boolean
)

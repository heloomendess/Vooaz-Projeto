package com.vooazdomain.Vooaz.modelsData.datas

import java.util.Date


data class User(
    val userId: Int,
    val name: String,
    val email: String,
    val password: String,
    val disabilityType: String,
    val birthDate: Date,
    val userPlans: Plans
)

data class Plans(
    val planId: Int,
    val planName: String,
    val monthlyFee: Double,
    val annualFee: Double,
    val benefits: List<String>
)
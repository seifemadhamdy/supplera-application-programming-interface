package com.seifemadhamdy.supplera.api.dto

import java.time.LocalDate

data class ProductDto(
    val id: Int = -1,
    val name: String = "",
    val brand: String = "",
    val isUsed: Boolean = false,
    val popularityIndex: Int = -1,
    val arrivalDate: LocalDate = LocalDate.now(),
    val price: Int = 0,
    val discountPercentage: Int = 0,
    val description: String = "",
    val collectionId: Int = -1
)

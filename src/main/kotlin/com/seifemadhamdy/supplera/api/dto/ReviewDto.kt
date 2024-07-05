package com.seifemadhamdy.supplera.api.dto

import java.time.LocalDate

data class ReviewDto(
    val id: Int = -1,
    val title: String = "",
    val name: String = "",
    val ratingScore: Int = 1,
    val date: LocalDate = LocalDate.now(),
    val body: String = "",
    val productId: Int = -1
)

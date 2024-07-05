package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val title: String,
    val name: String,
    val ratingScore: Int,
    val date: LocalDate,
    val body: String,
    @ManyToOne @JoinColumn(name = "productId", referencedColumnName = "id") val product: Product
)

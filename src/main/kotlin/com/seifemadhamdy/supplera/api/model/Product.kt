package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val name: String,
    val brand: String,
    val isUsed: Boolean,
    val popularityIndex: Int,
    val arrivalDate: LocalDate,
    val price: Int,
    val discountPercentage: Int,
    val description: String,
    @ManyToOne
    @JoinColumn(name = "collectionId", referencedColumnName = "id")
    val collection: Collection
)

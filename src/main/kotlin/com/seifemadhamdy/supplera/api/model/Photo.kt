package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class Photo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val photoUrl: String,
    @ManyToOne @JoinColumn(name = "productId", referencedColumnName = "id") val product: Product
)

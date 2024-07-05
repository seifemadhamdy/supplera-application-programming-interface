package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class Highlight(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val title: String,
    val description: String,
    @ManyToOne @JoinColumn(name = "productId", referencedColumnName = "id") val product: Product
)

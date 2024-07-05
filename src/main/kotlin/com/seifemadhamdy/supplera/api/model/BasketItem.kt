package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class BasketItem(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    @ManyToOne @JoinColumn(name = "basketId", referencedColumnName = "id") val basket: Basket,
    @ManyToOne @JoinColumn(name = "productId", referencedColumnName = "id") val product: Product
)

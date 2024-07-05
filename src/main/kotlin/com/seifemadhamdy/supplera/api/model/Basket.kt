package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class Basket(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    @ManyToOne @JoinColumn(name = "customerId", referencedColumnName = "id") val customer: Customer
)

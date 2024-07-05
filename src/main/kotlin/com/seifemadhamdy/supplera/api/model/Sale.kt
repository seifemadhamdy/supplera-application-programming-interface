package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class Sale(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    @Column(columnDefinition = "LONGTEXT") val photoBase64: String,
    val productName: String,
    val productDescription: String,
    val productPrice: Int,
    @ManyToOne @JoinColumn(name = "customerId", referencedColumnName = "id") val customer: Customer,
)

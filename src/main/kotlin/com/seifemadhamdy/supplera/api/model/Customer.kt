package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val phone: String,
    val address: String
)

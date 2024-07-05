package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val name: String,
)

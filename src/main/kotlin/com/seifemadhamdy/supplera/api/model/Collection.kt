package com.seifemadhamdy.supplera.api.model

import jakarta.persistence.*

@Entity
data class Collection(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
    val name: String,
    @ManyToOne @JoinColumn(name = "categoryId", referencedColumnName = "id") val category: Category
)

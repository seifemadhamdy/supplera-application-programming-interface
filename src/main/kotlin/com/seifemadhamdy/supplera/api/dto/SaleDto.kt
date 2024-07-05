package com.seifemadhamdy.supplera.api.dto

data class SaleDto(
    val id: Int = -1,
    val photoBase64: String = "",
    val productName: String = "",
    val productDescription: String = "",
    val productPrice: Int = 0,
    val customerId: Int = -1
)

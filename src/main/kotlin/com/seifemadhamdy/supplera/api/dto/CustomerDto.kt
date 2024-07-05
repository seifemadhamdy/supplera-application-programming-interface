package com.seifemadhamdy.supplera.api.dto

data class CustomerDto(
    var id: Int = -1,
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var phone: String = "",
    var address: String = ""
)

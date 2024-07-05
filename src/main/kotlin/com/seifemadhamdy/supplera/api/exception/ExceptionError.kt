package com.seifemadhamdy.supplera.api.exception

import org.springframework.http.HttpStatus

data class ExceptionError(
    val code: Int = HttpStatus.BAD_REQUEST.value(),
    val message: String? = "Something went wrong.",
)

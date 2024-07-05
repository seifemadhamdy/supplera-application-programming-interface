package com.seifemadhamdy.supplera.api.exception

import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
  @ExceptionHandler(Exception::class)
  fun genericExceptionHandler(exception: Exception): ResponseEntity<ExceptionError> {
    val apiError = ExceptionError(message = exception.message)
    return ResponseEntity(apiError, HttpStatusCode.valueOf(apiError.code))
  }
}

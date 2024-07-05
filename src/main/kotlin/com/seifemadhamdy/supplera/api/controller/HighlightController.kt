package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.service.base.HighlightService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HighlightController(private val highlightService: HighlightService) {
  @GetMapping("/highlight/product/{productId}")
  fun getAllHighlightsByProductId(@PathVariable productId: Int) =
      ResponseEntity(
          highlightService.getAllHighlightsByProductId(productId = productId), HttpStatus.OK)
}

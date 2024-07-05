package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.dto.BasketDto
import com.seifemadhamdy.supplera.api.service.base.BasketService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class BasketController(private val basketService: BasketService) {
  @PostMapping("/basket")
  fun createBasket(@RequestBody basketDto: BasketDto) =
      ResponseEntity(basketService.createBasket(basketDto = basketDto), HttpStatus.CREATED)

  @GetMapping("/basket/customer/{customerId}/last")
  fun getLastBasketByCustomerId(@PathVariable customerId: Int) =
      ResponseEntity(
          basketService.getLastBasketByCustomerId(customerId = customerId), HttpStatus.OK)
}

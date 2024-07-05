package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.dto.BasketItemDto
import com.seifemadhamdy.supplera.api.service.base.BasketItemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class BasketItemController(private val basketItemService: BasketItemService) {
  @PostMapping("/basket-item")
  fun createBasketItem(@RequestBody basketItemDto: BasketItemDto) =
      ResponseEntity(
          basketItemService.createBasketItem(basketItemDto = basketItemDto), HttpStatus.CREATED)

  @GetMapping("/basket-item/basket/{basketId}")
  fun getAllBasketItemsByBasketId(@PathVariable basketId: Int) =
      ResponseEntity(
          basketItemService.getAllBasketItemsByBasketId(basketId = basketId), HttpStatus.OK)

  @DeleteMapping("/basket-item/{id}")
  fun deleteBasketItemById(@PathVariable id: Int) =
      ResponseEntity(basketItemService.deleteBasketItemById(id = id), HttpStatus.NO_CONTENT)
}

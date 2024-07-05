package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.BasketItemDto

interface BasketItemService {
  fun createBasketItem(basketItemDto: BasketItemDto): BasketItemDto

  fun getAllBasketItemsByBasketId(basketId: Int): List<BasketItemDto>

  fun deleteBasketItemById(id: Int)
}

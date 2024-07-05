package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.BasketDto

interface BasketService {
  fun createBasket(basketDto: BasketDto): BasketDto

  fun getLastBasketByCustomerId(customerId: Int): BasketDto
}

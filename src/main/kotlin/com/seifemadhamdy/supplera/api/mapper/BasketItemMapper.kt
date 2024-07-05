package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.BasketItemDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.BasketItem
import com.seifemadhamdy.supplera.api.repository.BasketRepository
import com.seifemadhamdy.supplera.api.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class BasketItemMapper(
    private val basketRepository: BasketRepository,
    private val productRepository: ProductRepository
) : Mapper<BasketItemDto, BasketItem> {
  override fun fromEntity(entity: BasketItem): BasketItemDto =
      BasketItemDto(id = entity.id, basketId = entity.basket.id, productId = entity.product.id)

  override fun toEntity(domain: BasketItemDto): BasketItem =
      BasketItem(
          id = domain.id,
          basket = basketRepository.findById(domain.basketId).get(),
          product = productRepository.findById(domain.productId).get())
}

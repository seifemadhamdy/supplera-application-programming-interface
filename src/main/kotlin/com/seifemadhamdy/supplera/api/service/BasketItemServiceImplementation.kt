package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.BasketItemDto
import com.seifemadhamdy.supplera.api.mapper.BasketItemMapper
import com.seifemadhamdy.supplera.api.repository.BasketItemRepository
import com.seifemadhamdy.supplera.api.service.base.BasketItemService
import org.springframework.stereotype.Service

@Service
class BasketItemServiceImplementation(
    private val basketItemRepository: BasketItemRepository,
    private val basketItemMapper: BasketItemMapper
) : BasketItemService {
  override fun createBasketItem(basketItemDto: BasketItemDto): BasketItemDto {
    if (basketItemDto.id != -1) throw Exception("Id must be null or equal to -1.")

    return basketItemMapper.fromEntity(
        entity = basketItemRepository.save(basketItemMapper.toEntity(domain = basketItemDto)))
  }

  override fun getAllBasketItemsByBasketId(basketId: Int): List<BasketItemDto> {
    val basketItemsByBasketId = basketItemRepository.findAll().filter { it.basket.id == basketId }

    if (basketItemsByBasketId.isEmpty())
        throw Exception("No basket items exist for basket with id $basketId.")

    return basketItemsByBasketId.map { basketItemMapper.fromEntity(entity = it) }
  }

  override fun deleteBasketItemById(id: Int) {
    if (!basketItemRepository.existsById(id))
        throw Exception("Can not delete nonexistent basket item with id $id.")

    basketItemRepository.deleteById(id)
  }
}

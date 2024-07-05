package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.BasketDto
import com.seifemadhamdy.supplera.api.mapper.BasketMapper
import com.seifemadhamdy.supplera.api.repository.BasketRepository
import com.seifemadhamdy.supplera.api.service.base.BasketService
import org.springframework.stereotype.Service

@Service
class BasketServiceImplementation(
    private val basketRepository: BasketRepository,
    private val basketMapper: BasketMapper
) : BasketService {
  override fun createBasket(basketDto: BasketDto): BasketDto {
    if (basketDto.id != -1) throw Exception("Id must be null or equal to -1.")
    return basketMapper.fromEntity(
        entity = basketRepository.save(basketMapper.toEntity(domain = basketDto)))
  }

  override fun getLastBasketByCustomerId(customerId: Int): BasketDto {
    val basketsByCustomerId = basketRepository.findAll().filter { it.customer.id == customerId }

    if (basketsByCustomerId.isEmpty())
        throw Exception("No baskets exist for customer with id $customerId.")

    return basketMapper.fromEntity(entity = basketsByCustomerId.last())
  }
}

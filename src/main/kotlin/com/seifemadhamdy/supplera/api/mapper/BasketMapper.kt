package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.BasketDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Basket
import com.seifemadhamdy.supplera.api.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class BasketMapper(
    private val customerRepository: CustomerRepository,
) : Mapper<BasketDto, Basket> {
  override fun fromEntity(entity: Basket): BasketDto =
      BasketDto(
          id = entity.id,
          customerId = entity.customer.id,
      )

  override fun toEntity(domain: BasketDto): Basket =
      Basket(id = domain.id, customer = customerRepository.findById(domain.customerId).get())
}

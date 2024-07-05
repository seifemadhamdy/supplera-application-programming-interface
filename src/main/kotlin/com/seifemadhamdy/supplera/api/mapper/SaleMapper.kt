package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.SaleDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Sale
import com.seifemadhamdy.supplera.api.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class SaleMapper(
    private val customerRepository: CustomerRepository,
) : Mapper<SaleDto, Sale> {
  override fun fromEntity(entity: Sale): SaleDto =
      SaleDto(
          id = entity.id,
          photoBase64 = entity.photoBase64,
          productName = entity.productName,
          productDescription = entity.productDescription,
          productPrice = entity.productPrice,
          customerId = entity.customer.id)

  override fun toEntity(domain: SaleDto): Sale =
      Sale(
          id = domain.id,
          photoBase64 = domain.photoBase64,
          productName = domain.productName,
          productDescription = domain.productDescription,
          productPrice = domain.productPrice,
          customer = customerRepository.findById(domain.customerId).get())
}

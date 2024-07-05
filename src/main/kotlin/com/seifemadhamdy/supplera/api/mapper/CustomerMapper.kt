package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.CustomerDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Customer
import org.springframework.stereotype.Service

@Service
class CustomerMapper : Mapper<CustomerDto, Customer> {
  override fun fromEntity(entity: Customer): CustomerDto =
      CustomerDto(
          id = entity.id,
          name = entity.name,
          email = entity.email,
          password = entity.password,
          phone = entity.phone,
          address = entity.address)

  override fun toEntity(domain: CustomerDto): Customer =
      Customer(
          id = domain.id,
          name = domain.name,
          email = domain.email,
          password = domain.password,
          phone = domain.phone,
          address = domain.address)
}

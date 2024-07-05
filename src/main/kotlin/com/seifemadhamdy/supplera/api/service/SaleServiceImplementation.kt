package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.SaleDto
import com.seifemadhamdy.supplera.api.mapper.SaleMapper
import com.seifemadhamdy.supplera.api.repository.SaleRepository
import com.seifemadhamdy.supplera.api.service.base.SaleService
import org.springframework.stereotype.Service

@Service
class SaleServiceImplementation(
    private val saleRepository: SaleRepository,
    private val saleMapper: SaleMapper
) : SaleService {
  override fun createSale(saleDto: SaleDto): SaleDto {
    if (saleDto.id != -1) throw Exception("Id must be null or -1.")

    return saleMapper.fromEntity(
        entity = saleRepository.save(saleMapper.toEntity(domain = saleDto)))
  }

  override fun getAllSalesByCustomerId(customerId: Int): List<SaleDto> {
    val salesByCustomer = saleRepository.findAll().filter { it.customer.id == customerId }

    if (salesByCustomer.isEmpty())
        throw Exception("No sales exist for customer with id $customerId.")

    return salesByCustomer.map { saleMapper.fromEntity(entity = it) }
  }
}

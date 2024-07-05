package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.SaleDto

interface SaleService {
  fun createSale(saleDto: SaleDto): SaleDto

  fun getAllSalesByCustomerId(customerId: Int): List<SaleDto>
}

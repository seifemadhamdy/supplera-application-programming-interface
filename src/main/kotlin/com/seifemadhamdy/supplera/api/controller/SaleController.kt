package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.dto.SaleDto
import com.seifemadhamdy.supplera.api.service.base.SaleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class SaleController(private val saleService: SaleService) {
  @PostMapping("/sale")
  fun createSale(@RequestBody saleDto: SaleDto) =
      ResponseEntity(saleService.createSale(saleDto = saleDto), HttpStatus.CREATED)

  @GetMapping("/sale/customer/{customerId}")
  fun getAllSalesByCustomerId(@PathVariable customerId: Int) =
      ResponseEntity(saleService.getAllSalesByCustomerId(customerId = customerId), HttpStatus.OK)
}

package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.dto.CustomerDto
import com.seifemadhamdy.supplera.api.service.base.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController(private val customerService: CustomerService) {
  @PostMapping("/customer")
  fun createCustomer(@RequestBody customerDto: CustomerDto) =
      ResponseEntity(customerService.createCustomer(customerDto = customerDto), HttpStatus.CREATED)

  @GetMapping("/customer/{email}")
  fun getCustomerByEmail(@PathVariable email: String) =
      ResponseEntity(customerService.getCustomerByEmail(email = email), HttpStatus.OK)

  @PutMapping("/customer")
  fun updateCustomer(@RequestBody customerDto: CustomerDto) =
      ResponseEntity(customerService.updateCustomer(customerDto = customerDto), HttpStatus.OK)
}

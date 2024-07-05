package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.CustomerDto

interface CustomerService {
  fun createCustomer(customerDto: CustomerDto): CustomerDto

  fun getCustomerByEmail(email: String): CustomerDto

  fun updateCustomer(customerDto: CustomerDto): CustomerDto
}

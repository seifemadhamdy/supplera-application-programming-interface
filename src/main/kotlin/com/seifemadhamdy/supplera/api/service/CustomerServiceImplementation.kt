package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.CustomerDto
import com.seifemadhamdy.supplera.api.mapper.CustomerMapper
import com.seifemadhamdy.supplera.api.repository.CustomerRepository
import com.seifemadhamdy.supplera.api.service.base.CustomerService
import org.springframework.stereotype.Service

@Service
class CustomerServiceImplementation(
    private val customerRepository: CustomerRepository,
    private val customerMapper: CustomerMapper
) : CustomerService {
  override fun createCustomer(customerDto: CustomerDto): CustomerDto {
    if (customerDto.id != -1) throw Exception("Id must be null or equal to -1.")
    return customerMapper.fromEntity(
        entity = customerRepository.save(customerMapper.toEntity(domain = customerDto)))
  }

  override fun getCustomerByEmail(email: String): CustomerDto {
    val customerByEmail = customerRepository.findAll().find { it.email == email }
    if (customerByEmail == null) throw Exception("No customer exist with email $email.")
    return customerMapper.fromEntity(entity = customerByEmail)
  }

  override fun updateCustomer(customerDto: CustomerDto): CustomerDto {
    if (!customerRepository.existsById(customerDto.id))
        throw Exception("Can not update nonexistent customer with id ${customerDto.id}.")

    if (customerDto.name.isBlank() ||
        customerDto.email.isBlank() ||
        customerDto.password.isBlank() ||
        customerDto.phone.isBlank() ||
        customerDto.address.isBlank())
        throw Exception("Customer object can not have blank values.")

    customerRepository.save(customerMapper.toEntity(domain = customerDto))

    return customerDto
  }
}

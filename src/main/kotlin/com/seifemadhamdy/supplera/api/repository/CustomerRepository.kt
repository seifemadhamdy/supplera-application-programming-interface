package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int>

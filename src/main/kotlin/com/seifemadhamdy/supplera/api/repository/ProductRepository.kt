package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Int>

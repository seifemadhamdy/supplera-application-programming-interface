package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Sale
import org.springframework.data.repository.CrudRepository

interface SaleRepository : CrudRepository<Sale, Int>

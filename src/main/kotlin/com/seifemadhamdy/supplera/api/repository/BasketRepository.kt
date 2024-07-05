package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Basket
import org.springframework.data.repository.CrudRepository

interface BasketRepository : CrudRepository<Basket, Int>

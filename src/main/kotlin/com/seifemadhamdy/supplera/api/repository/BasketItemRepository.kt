package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.BasketItem
import org.springframework.data.repository.CrudRepository

interface BasketItemRepository : CrudRepository<BasketItem, Int>

package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category, Int>

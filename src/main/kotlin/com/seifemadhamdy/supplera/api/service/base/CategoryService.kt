package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.CategoryDto

interface CategoryService {
  fun getAllCategories(): List<CategoryDto>
}

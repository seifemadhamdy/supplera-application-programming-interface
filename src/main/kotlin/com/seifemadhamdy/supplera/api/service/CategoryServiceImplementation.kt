package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.CategoryDto
import com.seifemadhamdy.supplera.api.mapper.CategoryMapper
import com.seifemadhamdy.supplera.api.repository.CategoryRepository
import com.seifemadhamdy.supplera.api.service.base.CategoryService
import org.springframework.stereotype.Service

@Service
class CategoryServiceImplementation(
    private val categoryRepository: CategoryRepository,
    private val categoryMapper: CategoryMapper
) : CategoryService {
  override fun getAllCategories(): List<CategoryDto> {
    val categories = categoryRepository.findAll().toList()
    if (categories.isEmpty()) throw Exception("No categories exist.")
    return categories.map { categoryMapper.fromEntity(entity = it) }
  }
}

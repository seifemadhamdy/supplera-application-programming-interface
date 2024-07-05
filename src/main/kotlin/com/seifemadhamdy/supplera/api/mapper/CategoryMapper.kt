package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.CategoryDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Category
import org.springframework.stereotype.Service

@Service
class CategoryMapper : Mapper<CategoryDto, Category> {
  override fun fromEntity(entity: Category): CategoryDto =
      CategoryDto(
          id = entity.id,
          name = entity.name,
      )

  override fun toEntity(domain: CategoryDto): Category =
      Category(
          id = domain.id,
          name = domain.name,
      )
}

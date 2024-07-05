package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.CollectionDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Collection
import com.seifemadhamdy.supplera.api.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CollectionMapper(
    private val categoryRepository: CategoryRepository,
) : Mapper<CollectionDto, Collection> {
  override fun fromEntity(entity: Collection): CollectionDto =
      CollectionDto(
          id = entity.id,
          name = entity.name,
          categoryId = entity.category.id,
      )

  override fun toEntity(domain: CollectionDto): Collection =
      Collection(
          id = domain.id,
          name = domain.name,
          category = categoryRepository.findById(domain.categoryId).get())
}

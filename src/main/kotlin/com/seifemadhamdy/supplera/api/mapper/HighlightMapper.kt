package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.HighlightDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Highlight
import com.seifemadhamdy.supplera.api.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class HighlightMapper(private val productRepository: ProductRepository) :
    Mapper<HighlightDto, Highlight> {
  override fun fromEntity(entity: Highlight): HighlightDto =
      HighlightDto(
          id = entity.id,
          title = entity.title,
          description = entity.description,
          productId = entity.product.id)

  override fun toEntity(domain: HighlightDto): Highlight =
      Highlight(
          id = domain.id,
          title = domain.title,
          description = domain.description,
          product = productRepository.findById(domain.productId).get())
}

package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.HighlightDto
import com.seifemadhamdy.supplera.api.mapper.HighlightMapper
import com.seifemadhamdy.supplera.api.repository.HighlightRepository
import com.seifemadhamdy.supplera.api.service.base.HighlightService
import org.springframework.stereotype.Service

@Service
class HighlightServiceImplementation(
    private val highlightRepository: HighlightRepository,
    private val highlightMapper: HighlightMapper
) : HighlightService {
  override fun getAllHighlightsByProductId(productId: Int): List<HighlightDto> {
    val photosByProductId = highlightRepository.findAll().filter { it.product.id == productId }

    if (photosByProductId.isEmpty())
        throw Exception("No highlights exist for product with id $productId.")

    return photosByProductId.map { highlightMapper.fromEntity(entity = it) }
  }
}

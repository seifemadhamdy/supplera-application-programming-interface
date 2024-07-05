package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.ReviewDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Review
import com.seifemadhamdy.supplera.api.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ReviewMapper(
    private val productRepository: ProductRepository,
) : Mapper<ReviewDto, Review> {
  override fun fromEntity(entity: Review): ReviewDto =
      ReviewDto(
          id = entity.id,
          title = entity.title,
          name = entity.name,
          ratingScore = entity.ratingScore,
          date = entity.date,
          body = entity.body,
          productId = entity.product.id)

  override fun toEntity(domain: ReviewDto): Review =
      Review(
          id = domain.id,
          title = domain.title,
          name = domain.name,
          ratingScore = domain.ratingScore,
          date = domain.date,
          body = domain.body,
          product = productRepository.findById(domain.productId).get())
}

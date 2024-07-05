package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.ReviewDto
import com.seifemadhamdy.supplera.api.mapper.ReviewMapper
import com.seifemadhamdy.supplera.api.repository.ReviewRepository
import com.seifemadhamdy.supplera.api.service.base.ReviewService
import org.springframework.stereotype.Service

@Service
class ReviewServiceImplementation(
    private val reviewRepository: ReviewRepository,
    private val reviewMapper: ReviewMapper
) : ReviewService {
  override fun getAllReviewsByProductId(productId: Int): List<ReviewDto> {
    val reviewsByProductId = reviewRepository.findAll().filter { it.product.id == productId }

    if (reviewsByProductId.isEmpty())
        throw Exception("No reviews exist for product with id $productId.")

    return reviewsByProductId.map { reviewMapper.fromEntity(entity = it) }
  }

  override fun getRatersCountWithSpecificStarsForProduct(numberOfStars: Int, productId: Int) =
      reviewRepository.findAll().count {
        it.product.id == productId && it.ratingScore == numberOfStars
      }
}

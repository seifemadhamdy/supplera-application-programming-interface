package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.ReviewDto

interface ReviewService {
  fun getAllReviewsByProductId(productId: Int): List<ReviewDto>

  fun getRatersCountWithSpecificStarsForProduct(numberOfStars: Int, productId: Int): Int
}

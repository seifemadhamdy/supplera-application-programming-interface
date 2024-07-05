package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.service.base.ReviewService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ReviewController(private val reviewService: ReviewService) {
  @GetMapping("/review/product/{productId}")
  fun getAllReviewsByProductId(@PathVariable productId: Int) =
      ResponseEntity(reviewService.getAllReviewsByProductId(productId = productId), HttpStatus.OK)

  @GetMapping("/review/product/{productId}/five-star-raters-count/")
  fun getRatersCountWithFiveStarsForProduct(
      @PathVariable productId: Int,
  ) =
      ResponseEntity(
          reviewService.getRatersCountWithSpecificStarsForProduct(
              numberOfStars = 5, productId = productId),
          HttpStatus.OK)

  @GetMapping("/review/product/{productId}/four-star-raters-count/")
  fun getRatersCountWithFourStarsForProduct(
      @PathVariable productId: Int,
  ) =
      ResponseEntity(
          reviewService.getRatersCountWithSpecificStarsForProduct(
              numberOfStars = 4, productId = productId),
          HttpStatus.OK)

  @GetMapping("/review/product/{productId}/three-star-raters-count/")
  fun getRatersCountWithThreeStarsForProduct(
      @PathVariable productId: Int,
  ) =
      ResponseEntity(
          reviewService.getRatersCountWithSpecificStarsForProduct(
              numberOfStars = 3, productId = productId),
          HttpStatus.OK)

  @GetMapping("/review/product/{productId}/two-star-raters-count/")
  fun getRatersCountWithTwoStarsForProduct(
      @PathVariable productId: Int,
  ) =
      ResponseEntity(
          reviewService.getRatersCountWithSpecificStarsForProduct(
              numberOfStars = 2, productId = productId),
          HttpStatus.OK)

  @GetMapping("/review/product/{productId}/one-star-raters-count/")
  fun getRatersCountWithOneStarForProduct(
      @PathVariable productId: Int,
  ) =
      ResponseEntity(
          reviewService.getRatersCountWithSpecificStarsForProduct(
              numberOfStars = 1, productId = productId),
          HttpStatus.OK)
}

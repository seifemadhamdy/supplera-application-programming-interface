package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.dto.ProductDto
import com.seifemadhamdy.supplera.api.service.base.ProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService) {
  @GetMapping("/product")
  fun getAllProducts(): ResponseEntity<List<ProductDto>> =
      ResponseEntity(productService.getAllProducts(), HttpStatus.OK)

  @GetMapping("/product/{id}")
  fun getProductById(@PathVariable id: Int) =
      ResponseEntity(productService.getProductById(id = id), HttpStatus.OK)

  @GetMapping("/product/collection/{collectionId}")
  fun getAllProductsByCollectionId(@PathVariable collectionId: Int) =
      ResponseEntity(
          productService.getAllProductsByCollectionId(collectionId = collectionId), HttpStatus.OK)
}

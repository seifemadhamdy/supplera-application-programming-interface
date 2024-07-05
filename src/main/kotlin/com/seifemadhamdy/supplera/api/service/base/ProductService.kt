package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.ProductDto

interface ProductService {
  fun getAllProducts(): List<ProductDto>

  fun getProductById(id: Int): ProductDto

  fun getAllProductsByCollectionId(collectionId: Int): List<ProductDto>
}

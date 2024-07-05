package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.ProductDto
import com.seifemadhamdy.supplera.api.mapper.ProductMapper
import com.seifemadhamdy.supplera.api.repository.ProductRepository
import com.seifemadhamdy.supplera.api.service.base.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImplementation(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : ProductService {
  override fun getAllProducts(): List<ProductDto> {
    val products = productRepository.findAll().toList()
    if (products.isEmpty()) throw Exception("No products exist.")
    return products.map { productMapper.fromEntity(entity = it) }
  }

  override fun getProductById(id: Int): ProductDto =
      productMapper.fromEntity(
          entity =
              productRepository.findById(id).orElseThrow {
                Exception("Product with id $id does not exist.")
              })

  override fun getAllProductsByCollectionId(collectionId: Int): List<ProductDto> {
    val productsByCollectionId =
        productRepository.findAll().filter { it.collection.id == collectionId }

    if (productsByCollectionId.isEmpty())
        throw Exception("No products exist for collection with id $collectionId.")

    return productsByCollectionId.map { productMapper.fromEntity(entity = it) }
  }
}

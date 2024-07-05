package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.ProductDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Product
import com.seifemadhamdy.supplera.api.repository.CollectionRepository
import org.springframework.stereotype.Service

@Service
class ProductMapper(private val collectionRepository: CollectionRepository) :
    Mapper<ProductDto, Product> {
  override fun fromEntity(entity: Product): ProductDto =
      ProductDto(
          id = entity.id,
          name = entity.name,
          brand = entity.brand,
          isUsed = entity.isUsed,
          popularityIndex = entity.popularityIndex,
          arrivalDate = entity.arrivalDate,
          price = entity.price,
          discountPercentage = entity.discountPercentage,
          description = entity.description,
          collectionId = entity.collection.id)

  override fun toEntity(domain: ProductDto): Product =
      Product(
          id = domain.id,
          name = domain.name,
          brand = domain.brand,
          isUsed = domain.isUsed,
          popularityIndex = domain.popularityIndex,
          arrivalDate = domain.arrivalDate,
          price = domain.price,
          discountPercentage = domain.discountPercentage,
          description = domain.description,
          collection = collectionRepository.findById(domain.collectionId).get())
}

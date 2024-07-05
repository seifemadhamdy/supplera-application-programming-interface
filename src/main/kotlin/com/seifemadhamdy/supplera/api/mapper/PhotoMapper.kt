package com.seifemadhamdy.supplera.api.mapper

import com.seifemadhamdy.supplera.api.dto.PhotoDto
import com.seifemadhamdy.supplera.api.mapper.base.Mapper
import com.seifemadhamdy.supplera.api.model.Photo
import com.seifemadhamdy.supplera.api.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class PhotoMapper(private val productRepository: ProductRepository) : Mapper<PhotoDto, Photo> {
  override fun fromEntity(entity: Photo): PhotoDto =
      PhotoDto(id = entity.id, photoUrl = entity.photoUrl, productId = entity.product.id)

  override fun toEntity(domain: PhotoDto): Photo =
      Photo(
          id = domain.id,
          photoUrl = domain.photoUrl,
          product = productRepository.findById(domain.productId).get())
}

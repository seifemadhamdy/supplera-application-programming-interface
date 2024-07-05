package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.PhotoDto
import com.seifemadhamdy.supplera.api.mapper.PhotoMapper
import com.seifemadhamdy.supplera.api.repository.PhotoRepository
import com.seifemadhamdy.supplera.api.service.base.PhotoService
import org.springframework.stereotype.Service

@Service
class PhotoServiceImplementation(
    private val photoRepository: PhotoRepository,
    private val photoMapper: PhotoMapper
) : PhotoService {
  override fun getAllPhotosByProductId(productId: Int): List<PhotoDto> {
    val photosByProductId = photoRepository.findAll().filter { it.product.id == productId }

    if (photosByProductId.isEmpty())
        throw Exception("No photos exist for product with id $productId.")

    return photosByProductId.map { photoMapper.fromEntity(entity = it) }
  }
}

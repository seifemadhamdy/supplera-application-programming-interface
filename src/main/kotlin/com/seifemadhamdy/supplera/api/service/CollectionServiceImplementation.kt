package com.seifemadhamdy.supplera.api.service

import com.seifemadhamdy.supplera.api.dto.CollectionDto
import com.seifemadhamdy.supplera.api.mapper.CollectionMapper
import com.seifemadhamdy.supplera.api.repository.CollectionRepository
import com.seifemadhamdy.supplera.api.service.base.CollectionService
import org.springframework.stereotype.Service

@Service
class CollectionServiceImplementation(
    private val collectionRepository: CollectionRepository,
    private val collectionMapper: CollectionMapper
) : CollectionService {
  override fun getAllCollections(): List<CollectionDto> {
    val collections = collectionRepository.findAll().toList()
    if (collections.isEmpty()) throw Exception("No collections exist.")
    return collections.map { collectionMapper.fromEntity(entity = it) }
  }

  override fun getAllCollectionsByCategoryId(categoryId: Int): List<CollectionDto> {
    val collectionsByCategoryId =
        collectionRepository.findAll().filter { it.category.id == categoryId }

    if (collectionsByCategoryId.isEmpty())
        throw Exception("No collections exist for category with id $categoryId.")

    return collectionsByCategoryId.map { collectionMapper.fromEntity(entity = it) }
  }
}

package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.CollectionDto

interface CollectionService {
  fun getAllCollections(): List<CollectionDto>

  fun getAllCollectionsByCategoryId(categoryId: Int): List<CollectionDto>
}

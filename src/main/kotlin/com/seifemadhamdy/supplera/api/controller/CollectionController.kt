package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.service.base.CollectionService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CollectionController(private val collectionService: CollectionService) {
  @GetMapping("/collection")
  fun getAllCollections() = ResponseEntity(collectionService.getAllCollections(), HttpStatus.OK)

  @GetMapping("/collection/category/{categoryId}")
  fun getAllCollectionsByCategoryId(@PathVariable categoryId: Int) =
      ResponseEntity(
          collectionService.getAllCollectionsByCategoryId(categoryId = categoryId), HttpStatus.OK)
}

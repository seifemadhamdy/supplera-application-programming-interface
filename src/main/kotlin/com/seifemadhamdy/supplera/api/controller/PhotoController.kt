package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.service.base.PhotoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PhotoController(private val photoService: PhotoService) {
  @GetMapping("/photo/product/{productId}")
  fun getAllPhotosByProductId(@PathVariable productId: Int) =
      ResponseEntity(photoService.getAllPhotosByProductId(productId = productId), HttpStatus.OK)
}

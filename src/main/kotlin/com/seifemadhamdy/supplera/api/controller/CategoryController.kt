package com.seifemadhamdy.supplera.api.controller

import com.seifemadhamdy.supplera.api.service.base.CategoryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryController(private val categoryService: CategoryService) {
  @GetMapping("/category")
  fun getAllCategories() = ResponseEntity(categoryService.getAllCategories(), HttpStatus.OK)
}

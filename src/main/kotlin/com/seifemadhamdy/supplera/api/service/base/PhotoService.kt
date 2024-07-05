package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.PhotoDto

interface PhotoService {
  fun getAllPhotosByProductId(productId: Int): List<PhotoDto>
}

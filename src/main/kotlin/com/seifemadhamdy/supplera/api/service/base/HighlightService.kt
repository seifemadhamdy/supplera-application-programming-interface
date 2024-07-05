package com.seifemadhamdy.supplera.api.service.base

import com.seifemadhamdy.supplera.api.dto.HighlightDto

interface HighlightService {
  fun getAllHighlightsByProductId(productId: Int): List<HighlightDto>
}

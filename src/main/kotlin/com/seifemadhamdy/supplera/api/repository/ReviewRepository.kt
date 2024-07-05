package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Review
import org.springframework.data.repository.CrudRepository

interface ReviewRepository : CrudRepository<Review, Int>

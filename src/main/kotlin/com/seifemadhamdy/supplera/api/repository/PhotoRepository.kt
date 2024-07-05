package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Photo
import org.springframework.data.repository.CrudRepository

interface PhotoRepository : CrudRepository<Photo, Int>

package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Collection
import org.springframework.data.repository.CrudRepository

interface CollectionRepository : CrudRepository<Collection, Int>

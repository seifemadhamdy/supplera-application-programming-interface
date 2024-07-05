package com.seifemadhamdy.supplera.api.repository

import com.seifemadhamdy.supplera.api.model.Highlight
import org.springframework.data.repository.CrudRepository

interface HighlightRepository : CrudRepository<Highlight, Int>

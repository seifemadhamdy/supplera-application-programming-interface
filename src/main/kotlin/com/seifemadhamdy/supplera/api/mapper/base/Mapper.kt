package com.seifemadhamdy.supplera.api.mapper.base

interface Mapper<Domain, Entity> {
  fun fromEntity(entity: Entity): Domain

  fun toEntity(domain: Domain): Entity
}

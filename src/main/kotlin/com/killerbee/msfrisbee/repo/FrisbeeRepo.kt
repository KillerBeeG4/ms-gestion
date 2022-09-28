package com.killerbee.msfrisbee.repo

import com.killerbee.msfrisbee.entities.Frisbee
import org.springframework.data.jpa.repository.JpaRepository

interface FrisbeeRepo : JpaRepository<Frisbee, Long> {
}
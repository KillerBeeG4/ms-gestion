package com.killerbee.msfrisbee.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Frisbee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    var name: String? = null

    var description: String? = null

    var PUHT: String? = null

    var gamme: String? = null

    var ingredients: String? = null
}
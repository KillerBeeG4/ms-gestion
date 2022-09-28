package com.killerbee.msfrisbee

import com.killerbee.msfrisbee.entities.Frisbee
import com.killerbee.msfrisbee.repo.FrisbeeRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FrisbeeController {

    @Autowired
    private lateinit var repo: FrisbeeRepo

    @GetMapping("/all")
    fun getAll() : List<Frisbee> {
        return repo.findAll()
    }
}
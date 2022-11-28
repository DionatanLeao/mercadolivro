package com.mercadolivro.controller

import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel {
        return CustomerModel(id = "1", name = "Name 1", email = "email@email.com")
    }

}
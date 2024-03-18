package com.belajar.kotlinrestfulapi.service

import com.belajar.kotlinrestfulapi.model.CreateProductRequest
import com.belajar.kotlinrestfulapi.model.ProductResponse
import com.belajar.kotlinrestfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

}
package com.belajar.kotlinrestfulapi.service

import com.belajar.kotlinrestfulapi.model.CreateProductRequest
import com.belajar.kotlinrestfulapi.model.ListProductRequest
import com.belajar.kotlinrestfulapi.model.ProductResponse
import com.belajar.kotlinrestfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse //create interface function for create data in json

    fun get(id: String): ProductResponse //create interface function for getting data in json

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse //create interface function for update data in json

    fun delete(id: String) //create interface function for delete data in json

    fun list(listProductRequest: ListProductRequest): List<ProductResponse> //create interface function for listing data

}
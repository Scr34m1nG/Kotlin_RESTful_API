package com.belajar.kotlinrestfulapi.service.impl

import com.belajar.kotlinrestfulapi.entity.Product
import com.belajar.kotlinrestfulapi.model.CreateProductRequest
import com.belajar.kotlinrestfulapi.model.ProductResponse
import com.belajar.kotlinrestfulapi.repository.ProductRepository
import com.belajar.kotlinrestfulapi.service.ProductService
import com.belajar.kotlinrestfulapi.validation.ValidationUtil
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository,
                         val validationUtil: ValidationUtil
) : ProductService{
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }

    override fun get(id: String): ProductResponse {
        val product = productRepository.findByIdOrNull(id)

        if (product == null) {
            //
        } else{
            return ProductResponse(
                id = product.id,
                name = product.name,
                price = product.price,
                quantity = product.quantity,
                createdAt = product.createdAt,
                updatedAt = product.updatedAt
            )
        }
    }
}
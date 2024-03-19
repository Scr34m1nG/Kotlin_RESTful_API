package com.belajar.kotlinrestfulapi.model

import java.util.Date

data class ProductResponse( // to prepare what variables are needed when providing responses.
    val id: String,
    val name: String,
    val price: Long,
    val quantity: Int,
    val createdAt: Date,
    val updatedAt: Date?
)

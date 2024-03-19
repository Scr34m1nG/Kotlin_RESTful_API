package com.belajar.kotlinrestfulapi.repository

import com.belajar.kotlinrestfulapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>{ // access to database

}
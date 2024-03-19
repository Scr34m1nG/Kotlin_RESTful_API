package com.belajar.kotlinrestfulapi.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "api_key")
data class ApiKey ( //create table in database
    @Id
    val id: String
)
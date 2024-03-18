package com.belajar.kotlinrestfulapi.repository

import com.belajar.kotlinrestfulapi.entity.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}
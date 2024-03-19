package com.belajar.kotlinrestfulapi.config

import com.belajar.kotlinrestfulapi.entity.ApiKey
import com.belajar.kotlinrestfulapi.repository.ApiKeyRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class ApiKeySeeder(val apiKeyRepository: ApiKeyRepository) : ApplicationRunner {

    //create API key
    val apiKey = "SECRET"

    override fun run(args: ApplicationArguments?) {
        if (!apiKeyRepository.existsById(apiKey)){
            val key = ApiKey(id = apiKey)
            apiKeyRepository.save(key)
        }
    }

}
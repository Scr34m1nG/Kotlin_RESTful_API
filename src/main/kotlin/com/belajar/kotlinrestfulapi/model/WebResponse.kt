package com.belajar.kotlinrestfulapi.model

data class WebResponse<T>( //to prepare what variables are needed when web give responses
    val code: Int,
    val status: String,
    val data: T
    )

package com.example.assignement4testplace.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BramptonWeatherModel (
    val id: String,
    @SerialName(value = "img_src")
    val img_src:String
)
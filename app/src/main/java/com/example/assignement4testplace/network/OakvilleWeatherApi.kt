package com.example.assignement4testplace.network

import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType

private const val BASE_URL =
    "http://api.openweathermap.org/data/2.5/weather?q=Oakville,ca&APPID=e3264b4c4105494a3f84c71943fce3db&units=metric"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface OakvilleWeatherApi{
    @GET ("photos")
    suspend fun getPhotos():List<OakvilleWeatherModel>
}

object OakvilleApi{
    val retrofitService : OakvilleWeatherApi by lazy {
        retrofit.create(OakvilleWeatherApi::class.java)
    }
}
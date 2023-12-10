package com.example.assignement4testplace.network

import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface BramptonWeatherApi{
    @GET ("photos")
    suspend fun getPhotos():List<BramptonWeatherModel>
}

object BramptonApi{
    val retrofitService : BramptonWeatherApi by lazy {
        retrofit.create(BramptonWeatherApi::class.java)
    }
}
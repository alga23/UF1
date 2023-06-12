package com.example.examen_uf1.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiCall {
    @GET("api.openweathermap.org/data/2.5/weather?q={city name}&appid=835babac7f4d7e37f8f51a1abac4fe63\n\n")
    fun getData(@Query("{city name}") lat: String?): Call<ModelApi?>
}


package com.example.work_api.api

import com.example.work_api.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("getfata.php")
    fun getProductApi(): Call<List<Product>>
}
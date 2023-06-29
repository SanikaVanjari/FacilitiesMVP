package com.product.facilitiesmvp.api

import com.product.facilitiesmvp.model.Facilities
import retrofit2.Call

import retrofit2.http.GET


interface ApiInterface {

    @GET("db")
    fun getFacilities(): Call<Facilities?>?

}
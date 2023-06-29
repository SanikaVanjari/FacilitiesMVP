package com.product.facilitiesmvp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    val BASE_URL = "https://my-json-server.typicode.com/iranjith4/ad-assignment/"
    private var retrofit: Retrofit? = null
    val IMAGE_BASE_URL = "http://bit.ly/2KKsH0G"

    /**
     * This method returns retrofit client instance
     *
     * @return Retrofit object
     */
    fun getClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}
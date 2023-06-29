package com.product.facilitiesmvp.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Option(
    @SerializedName("icon")
    val icon: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)
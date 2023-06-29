package com.product.facilitiesmvp.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Facilities(
    @SerializedName("exclusions")
    val exclusions: List<List<Exclusion>>,
    @SerializedName("facilities")
    val facilities: List<Facility>
)
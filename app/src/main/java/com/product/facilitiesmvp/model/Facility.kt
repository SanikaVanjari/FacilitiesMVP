package com.product.facilitiesmvp.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Facility(
    @SerializedName("facility_id")
    val facilityId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("options")
    val options: List<Option>
)
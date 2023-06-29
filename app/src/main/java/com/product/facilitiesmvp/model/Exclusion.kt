package com.product.facilitiesmvp.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Exclusion(
    @SerializedName("facility_id")
    val facilityId: String,
    @SerializedName("options_id")
    val optionsId: String
)
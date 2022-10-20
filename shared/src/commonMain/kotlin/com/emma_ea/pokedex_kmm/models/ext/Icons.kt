package com.emma_ea.pokedex_kmm.models.ext


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Icons(
    @SerialName("front_default")
    val frontDefault: String,
    @SerialName("front_female")
    val frontFemale: Any
)
package com.emma_ea.pokedex_kmm.models.ext


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OfficialArtwork(
    @SerialName("front_default")
    val frontDefault: String
)
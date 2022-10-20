package com.emma_ea.pokedex_kmm.models.ext


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Form(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)
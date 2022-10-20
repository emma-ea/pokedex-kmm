package com.emma_ea.pokedex_kmm.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pokemons(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: Any,
    @SerialName("results")
    val results: List<Result>
)
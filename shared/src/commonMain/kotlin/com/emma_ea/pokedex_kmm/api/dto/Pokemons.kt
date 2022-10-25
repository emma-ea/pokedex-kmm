package com.emma_ea.pokedex_kmm.api.dto


import com.emma_ea.pokedex_kmm.api.DynamicLookupSerializer
import kotlinx.serialization.Contextual
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@OptIn(ExperimentalSerializationApi::class)
@Serializable(with = DynamicLookupSerializer::class)
data class Pokemons(
    @SerialName("count")
    val count: Int,
    @SerialName("next")
    val next: String,
    @SerialName("previous")
    val previous: @Contextual Any? = null,
    @SerialName("results")
    val results: List<Result>
)
package com.emma_ea.pokedex_kmm.models.ext


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ability(
    @SerialName("ability")
    val ability: AbilityX,
    @SerialName("is_hidden")
    val isHidden: Boolean,
    @SerialName("slot")
    val slot: Int
)
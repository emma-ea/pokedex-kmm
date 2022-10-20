package com.emma_ea.pokedex_kmm.models.ext


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Move(
    @SerialName("move")
    val move: MoveX,
    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)
package com.emma_ea.pokedex_kmm.model

data class Pokemon(
    val id: Int,
    val name: String,
) {
    override fun toString(): String {
        return "Pokemon[ $id $name ]"
    }
}
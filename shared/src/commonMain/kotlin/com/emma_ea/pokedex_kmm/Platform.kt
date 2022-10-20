package com.emma_ea.pokedex_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
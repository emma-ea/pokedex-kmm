package com.emma_ea.pokedex_kmm.usecase

import com.emma_ea.pokedex_kmm.api.dto.PokemonModel
import com.emma_ea.pokedex_kmm.model.Pokemon
import com.emma_ea.pokedex_kmm.repository.Repository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class FetchPokemonsUsecase : KoinComponent {

    private val repo: Repository by inject()

    suspend operator fun invoke(): List<Pokemon> {
        return repo.allPokemons()
    }


}
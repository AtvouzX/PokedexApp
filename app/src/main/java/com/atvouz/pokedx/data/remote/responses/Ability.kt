package com.atvouz.pokedx.data.remote.responses

data class Ability(
    val ability: AbilityX,
    val isHidden: Boolean,
    val slot: Int
)
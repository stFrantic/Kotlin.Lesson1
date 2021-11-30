package com.example.lesson1.src

import kotlin.random.Random

data class Character (
    override var strength: Int,
    override var agility: Int,
    override var intelligence: Int,
    override var movementSpeed: Int,
    override var damage: Int
) : ICharacter{

    fun createHero() {
        this.strength = Random.nextInt(25, 46)
        this.agility = Random.nextInt(25, 46)
        this.intelligence = Random.nextInt(25, 46)
        this.movementSpeed = Random.nextInt(290, 330)
        this.damage = Random.nextInt(45, 80)
    }
}

class Hero(
    override var name: String,
    private val character: Character
) : ICharacter by character, IHero
//(strength, agility, intelligence, movementSpeed, damage)
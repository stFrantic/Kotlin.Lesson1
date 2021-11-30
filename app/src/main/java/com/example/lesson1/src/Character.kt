package com.example.lesson1.src

import kotlin.random.Random

data class Character(
    override var strength: Int = 0,
    override var agility: Int = 0,
    override var intelligence: Int = 0,
    override var movementSpeed: Int = 0,
    override var damage: Int = 0
) : ICharacter {

    fun createHero() {
        this.strength = Random.nextInt(25, 46)
        this.agility = Random.nextInt(25, 46)
        this.intelligence = Random.nextInt(25, 46)
        this.movementSpeed = Random.nextInt(290, 330)
        this.damage = Random.nextInt(45, 80)
    }
}

class Hero(
    override var name: String = "Jhon",
    val character: Character = Character()
) : ICharacter by character, IHero {
    override fun toString(): String {
        return "Hero(name $name " +
                "strength ${character.strength}," +
                "agility ${character.agility}," +
                "intelligence ${character.intelligence}," +
                "movementSpeed ${character.movementSpeed}," +
                "damage ${character.damage})";
    }
}

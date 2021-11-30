package com.example.lesson1.src

import kotlin.random.Random

 data class Character(
    open var strength: Int,
    open var agility: Int,
    open var intelligence: Int,
    open var movementSpeed: Int,
    open var damage: Int
) {

    fun createHero() {
        this.strength = Random.nextInt(25, 46)
        this.agility = Random.nextInt(25, 46)
        this.intelligence = Random.nextInt(25, 46)
        this.movementSpeed = Random.nextInt(290, 330)
        this.damage = Random.nextInt(45, 80)
    }
}

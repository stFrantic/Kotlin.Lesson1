package com.example.lesson1.src

fun (Character).calc(): Int {
    return this.strength + this.agility + this.intelligence + this.movementSpeed + this.damage
}
fun Hero.calc(): Int {
    return this.strength + this.agility + this.intelligence + this.movementSpeed + this.damage + this.name.hashCode()/10000
}
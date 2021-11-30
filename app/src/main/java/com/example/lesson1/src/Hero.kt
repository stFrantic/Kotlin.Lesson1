package com.example.lesson1.src

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

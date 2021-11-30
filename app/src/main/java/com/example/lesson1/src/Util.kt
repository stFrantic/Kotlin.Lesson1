package com.example.lesson1.src

class Util(var unknown: Any) {
    constructor(ch: Character) : this(unknown = ch)
    constructor(hero: Hero) : this(unknown = hero)

    fun calculate(): Int {
        if (unknown is Character) {
            return ((unknown as Character).component1() +
                    (unknown as Character).component2() +
                    (unknown as Character).component3() +
                    (unknown as Character).component4() +
                    (unknown as Character).component5())
        } else
            return Util((unknown as Hero).character).calculate() + (unknown as Hero).name.hashCode()/10000
    }
}

//fun main() {
//    var ch = Character()
//    ch.createHero()
//    println(ch.toString() + " Sum: " + Util(ch).calculate().toString())
//    var he = Hero();
//    he.character.createHero()
//    println(he.name.hashCode()/10000)
//    println(he.toString() + " Sum: " + Util(he).calculate().toString())
//
//}
package com.example.lesson1.classes

class Vape(
    name: String,
    price: Double,
    strength: Int,
    model: Int,
    color:String,
    power : Int) : ECigarettes(name, price, strength,model,color) {
    var power : Int = power
    set(ppower){
        if (ppower > 0 && ppower < Int.MAX_VALUE) field = ppower
    }
}
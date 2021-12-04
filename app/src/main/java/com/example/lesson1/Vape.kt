package com.example.lesson1

class Vape(
    name: String,
    price: Double,
    strength: Int,
    model: Int,
    color:String,
    val power : Int) :ECigarettes(name, price, strength,model,color) {
}
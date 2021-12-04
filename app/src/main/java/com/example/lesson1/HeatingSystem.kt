package com.example.lesson1

class HeatingSystem(
    name: String,
    price: Double,
    strength: Int,
    model: Int,
    color: String,
    val sticksInRow : Int
) : ECigarettes(name, price, strength, model, color) {
}
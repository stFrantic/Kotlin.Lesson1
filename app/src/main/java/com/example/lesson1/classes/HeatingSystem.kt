package com.example.lesson1.classes

class HeatingSystem(
    name: String,
    price: Double,
    strength: Int,
    model: Int,
    color: String,
    sticksInRow: Int
) : ECigarettes(name, price, strength, model, color) {
    var sticksInRow: Int = sticksInRow
        set(pamount) {
            if (pamount > 0 && pamount < Int.MAX_VALUE) field = pamount
        }
}
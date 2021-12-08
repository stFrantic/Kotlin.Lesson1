package com.example.lesson1.classes

abstract class ECigarettes(
    name: String,
    price: Double,
    strength: Int,
    model: Int,
    color: String,
    type: TypeOfCigaretts = TypeOfCigaretts.ECIGARETTE
) : Cigarettes(name, price, strength, type) {
    var model: Int = model
        set(pmodel) {
            if (model > 0 && model < Int.MAX_VALUE) field = pmodel
        }
    var color: String = color
        set(pcolor) {
            if ("" != color) field = pcolor
        }
}

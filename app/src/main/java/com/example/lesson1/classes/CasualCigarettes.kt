package com.example.lesson1.classes

class CasualCigarettes(
    name: String,
    price: Double,
    strength: Int,
    hasCapsule: Boolean,
    amountOfCigarettesInPack: Int,
    type: TypeOfCigaretts = TypeOfCigaretts.CIGARETTE,
) : Cigarettes(name, price, strength, type) {
    var amountOfCigarettesInPack: Int = amountOfCigarettesInPack
        set(pamount) {
            if (pamount > 0.0 && pamount < Int.MAX_VALUE) field = pamount
        }
    var hasCapsule: Boolean = hasCapsule
        set(pCapsule) {
            field = pCapsule
        }
}
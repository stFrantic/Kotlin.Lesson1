package com.example.lesson1.classes

abstract class Cigarettes(
    name: String,
    price: Double,
    strength: Int,
    type: TypeOfCigaretts
) {
     var name: String = name
        set(pname) {
            if ("" != pname) field = pname
        }
      var price: Double = price
        set(pprice) {
            if (pprice > 0.0 && pprice < Double.MAX_VALUE) field = pprice

        }
     var strength: Int = strength

        set(pstrength) {
            if (pstrength > 0.0 && pstrength < Int.MAX_VALUE) field = pstrength
        }
     var type: TypeOfCigaretts = type
        set(ptype) {
            field = ptype
        }
}
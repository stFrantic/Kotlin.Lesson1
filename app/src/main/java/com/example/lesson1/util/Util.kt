package com.example.lesson1.util

import com.example.lesson1.classes.CasualCigarettes
import com.example.lesson1.classes.Cigarettes
import com.example.lesson1.classes.HeatingSystem
import com.example.lesson1.classes.Vape

class Util {
}
fun Cigarettes.getString():String{
    when (this) {
        is Vape -> return (this as Vape).getString()
        is HeatingSystem -> return (this as HeatingSystem).getString()
        else -> return (this as CasualCigarettes).getString()
    }
}

fun Vape.getString(): String {
    return "Name: " + name + "\n" +
            "Price:" + price + "\n" +
            "Strength: " + strength + "\n" +
            "Model: " + model + "\n" +
            "Color: "+ color + "\n" +
            "Power: "+ strength + "\n"
}
fun HeatingSystem.getString(): String {
    return "Name: " + name + "\n" +
            "Price:" + price + "\n" +
            "Strength: " + strength + "\n" +
            "Model: " + model + "\n" +
            "Color: "+ color + "\n" +
            "Sticks in a row: "+ sticksInRow + "\n"
}
fun CasualCigarettes.getString(): String {
    return "Name: " + name + "\n" +
            "Price:" + price + "\n" +
            "Strength: " + strength + "\n" +
            "Has capsule: " + hasCapsule + "\n" +
            "Amount of cigarettes in pack: "+ amountOfCigarettesInPack + "\n"
}
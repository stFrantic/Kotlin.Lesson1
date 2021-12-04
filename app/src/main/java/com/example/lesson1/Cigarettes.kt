package com.example.lesson1

abstract class Cigarettes(
    open val name: String,
    open val price: Double,
    open val strength: Int,
    open val type: TypeOfCigaretts


) {
    override fun toString():String {
    return name
    }
}
package com.example.lesson1.src

import com.example.lesson1.classes.Cigarettes

object OrderSingleton {
    val order: ArrayList<Cigarettes> = arrayListOf()
    fun getName() : String{
        var res =""
        if (order.size != 0)
        order.forEach { res+= it.name + ", " }
        return res
    }
}


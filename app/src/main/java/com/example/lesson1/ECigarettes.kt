package com.example.lesson1

abstract class ECigarettes(
    override val name: String,
    override val price: Double,
    override val strength: Int,
    val model: Int,
    val color: String,
    type: TypeOfCigaretts = TypeOfCigaretts.ECIGARETTE
):Cigarettes(name,price,strength,type){

}
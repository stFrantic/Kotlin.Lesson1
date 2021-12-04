package com.example.lesson1

class CasualCigarettes (
    override val name : String,
    override val price : Double,
    override val strength: Int,
    val hasCapsule : Boolean,
    val amountOfCigarettesInPack : Int,
    type : TypeOfCigaretts = TypeOfCigaretts.CIGARETTE,
):Cigarettes(name,price,strength,type){
}
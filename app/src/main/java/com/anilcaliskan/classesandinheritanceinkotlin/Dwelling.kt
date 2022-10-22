package com.anilcaliskan.classesandinheritanceinkotlin

import java.lang.Math.PI
import java.lang.Math.sqrt

/**
 * Defines properties common to all dwellings.
 * All dwellings have floorspace,
 * but its calculation is specific to the subclass.
 * Checking and getting a room are implemented here
 * because they are the same for all Dwelling subclasses.
 **/

abstract class Dwelling (private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    abstract fun floorArea(): Double

    fun hasRoom(): Boolean {
        return residents < capacity
    }
    fun getRoom(){
        if(capacity > residents){
            println("You got a room!")
        }else{
            println("Sorry, at capacity and no rooms left.")
        }
    }

}
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial: String = "Wood"
    override val capacity = 6
    //Calculates floor area for a square dwelling.
    override fun floorArea(): Double {
        //return floor area.
        return length * length

    }
}
open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 3
    //Calculates floor area for a round dwelling.
    override fun floorArea(): Double {
        return PI * radius * radius
    }
    fun calculateMaxCarpetLength(): Double {
        return sqrt(2.0) * radius
    }
}
//Round tower with multiple stories.
class RoundTower(residents: Int, radius: Double, val floors: Int = 2) : RoundHut(residents, radius) {
    //The class to inherit must be abstract or open.
    override val buildingMaterial: String = "Stone"
    override val capacity: Int = 4 * floors
    //Calculates the total floor area for a tower dwelling.
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }

}
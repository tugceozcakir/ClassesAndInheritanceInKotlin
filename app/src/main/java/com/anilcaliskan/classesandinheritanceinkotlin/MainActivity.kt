package com.anilcaliskan.classesandinheritanceinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/**
 * Program that implements classes for different kinds of dwellings.
 * Shows how to:
 * Create class hierarchy, variables and functions with inheritance,
 * abstract class, overriding, and private vs. public variables.
 */
class MainActivity: AppCompatActivity() {
    val squareCabin = SquareCabin(4, 50.0)
    val roundHut = RoundHut(8, 10.0)
    val roundTower = RoundTower(5, 15.5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(squareCabin){
            // all operations to do with squareCabin
            println("\nSquare Cabin\n============")
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Has room? ${hasRoom()}")
            println("Floor area: ${floorArea()}")
            getRoom()
        }
        with(roundHut) {
            println("\nRound Hut\n=========")
            println("Material: ${buildingMaterial}")
            println("Capacity: ${capacity}")
            println("Has room? ${hasRoom()}")
            println("Floor area: ${floorArea()}")
            getRoom()
            println("Carpet Length: ${calculateMaxCarpetLength()}")
        }
        with(roundTower) {
            println("\nRound Tower\n=========")
            println("Material: ${buildingMaterial}")
            println("Capacity: ${capacity}")
            println("Has room? ${hasRoom()}")
            println("Floor area: ${floorArea()}")
            getRoom()
        }

    }

}
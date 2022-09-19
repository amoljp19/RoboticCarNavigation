package com.softaai.roboticcarnavigation

import android.os.Build.VERSION_CODES.N


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */
object RoboticCarController {

    fun proccess(commandString: String){
        //ToDo implementation remainging
    }


    fun spinLeft(intialDirection:String){
        //  Left Spin Mapping is {N->E, E->S, S->W, W->N}
        val roboticCar = RoboticCar()
        when (intialDirection){
            "N" -> roboticCar.direction = "E"
            "E" -> roboticCar.direction = "S"
            "S" -> roboticCar.direction = "W"
            "W" -> roboticCar.direction = "N"
            else -> throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
        }

        println("after left spin ${roboticCar}")
    }
}
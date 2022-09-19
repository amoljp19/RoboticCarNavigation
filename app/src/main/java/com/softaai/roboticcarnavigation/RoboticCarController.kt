package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */
object RoboticCarController {

    fun proccess(commandString: String) {
        //ToDo implementation remainging
    }


    fun spinLeft(initialDirection: String) {
        //  Left Spin Mapping is {N->E, E->S, S->W, W->N}
        val roboticCar = RoboticCar()
        when (initialDirection) {
            "N" -> roboticCar.direction = "E"
            "E" -> roboticCar.direction = "S"
            "S" -> roboticCar.direction = "W"
            "W" -> roboticCar.direction = "N"
            else -> throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
        }

        println("after left spin ${roboticCar}")
    }


    fun spinRight(initialDirection: String) {
        //  Right Spin Mapping is {N->W, W->S, S->E, E->N}
        val roboticCar = RoboticCar()
        when (initialDirection) {
            "N" -> roboticCar.direction = "W"
            "E" -> roboticCar.direction = "N"
            "S" -> roboticCar.direction = "E"
            "W" -> roboticCar.direction = "S"
            else -> throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
        }

        println("after right spin ${roboticCar}")
    }


    fun move(initialDirection: String) {
        val roboticCar = RoboticCar()
        when (initialDirection) {
            "N" -> roboticCar.y += 1
            "S" -> roboticCar.y -= 1
            "W" -> roboticCar.x += 1
            "E" -> roboticCar.x -= 1
            else -> throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
        }
    }
}
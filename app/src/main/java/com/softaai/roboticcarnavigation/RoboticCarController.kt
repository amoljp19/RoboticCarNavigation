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
            "N" -> {
                roboticCar.facingDirection.direction = "E"
            }
            "E" -> {
                roboticCar.facingDirection.direction = "S"
            }
            "S" -> {
                roboticCar.facingDirection.direction = "W"
            }
            "W" -> {
                roboticCar.facingDirection.direction = "N"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }

        println("after left spin ${roboticCar}")
    }


    fun spinRight(initialDirection: String) {
        //  Right Spin Mapping is {N->W, W->S, S->E, E->N}
        val roboticCar = RoboticCar()
        when (initialDirection) {
            "N" -> {
                roboticCar.facingDirection.direction = "W"
            }
            "E" -> {
                roboticCar.facingDirection.direction = "N"
            }
            "S" -> {
                roboticCar.facingDirection.direction = "E"
            }
            "W" -> {
                roboticCar.facingDirection.direction = "S"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }

        println("after right spin ${roboticCar}")
    }


    fun move(initialDirection: String) {
        val roboticCar = RoboticCar()
        when (initialDirection) {
            "N" -> {
                roboticCar.position.y += 1
                roboticCar.facingDirection.direction = "N"
            }
            "S" -> {
                roboticCar.position.y -= 1
                roboticCar.facingDirection.direction = "S"
            }
            "W" -> {
                roboticCar.position.x += 1
                roboticCar.facingDirection.direction = "W"
            }
            "E" -> {
                roboticCar.position.x -= 1
                roboticCar.facingDirection.direction = "E"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }

        println("Moved $roboticCar")
    }
}
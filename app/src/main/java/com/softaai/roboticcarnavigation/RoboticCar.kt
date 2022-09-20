package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */
class RoboticCar(var roboticCarLocation: RoboticCarLocation = RoboticCarLocation()) {

    fun spinLeft() {
        //  Left Spin Mapping is {N->W, E->N, S->E, W->S}

        when (roboticCarLocation.facingDirection.direction) {
            "N" -> {
                roboticCarLocation.facingDirection.direction = "W"
            }
            "E" -> {
                roboticCarLocation.facingDirection.direction = "N"
            }
            "S" -> {
                roboticCarLocation.facingDirection.direction = "E"
            }
            "W" -> {
                roboticCarLocation.facingDirection.direction = "S"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }

    }


    fun spinRight() {

        //  Right Spin Mapping is {N->E, W->N, S->W, E->S}

        when (roboticCarLocation.facingDirection.direction) {
            "N" -> {
                roboticCarLocation.facingDirection.direction = "E"
            }
            "E" -> {
                roboticCarLocation.facingDirection.direction = "S"
            }
            "S" -> {
                roboticCarLocation.facingDirection.direction = "W"
            }
            "W" -> {
                roboticCarLocation.facingDirection.direction = "N"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }
    }


    fun move() {

        //  moving forwards towards north means y+1
        //  moving forwards towards west means  x+1
        //  moving forwards towards south means y-1
        //  moving forwards towards east means  x-1


        when (roboticCarLocation.facingDirection.direction) {
            "N" -> {
                roboticCarLocation.position.y += 1
                roboticCarLocation.facingDirection.direction = "N"
            }
            "S" -> {
                roboticCarLocation.position.y -= 1
                roboticCarLocation.facingDirection.direction = "S"
            }
            "W" -> {
                roboticCarLocation.position.x -= 1
                roboticCarLocation.facingDirection.direction = "W"
            }
            "E" -> {
                roboticCarLocation.position.x += 1
                roboticCarLocation.facingDirection.direction = "E"
            }
            else -> {
                throw IllegalArgumentException("initialDirection value not as per four cardinal compass points{N, E, S, W}!")
            }
        }

    }
}
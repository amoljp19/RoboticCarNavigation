package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */
object RoboticCarController {

    fun navigateCar(roboticCar: RoboticCar, commandString: String) {
        for (i in commandString) {
            when (i.toString()) {
                "L" -> roboticCar.spinLeft()
                "R" -> roboticCar.spinRight()
                "M" -> roboticCar.move()
                else -> throw IllegalArgumentException("commandString should contains only{L,R,M}!")
            }
        }

        println("Car navigated at ${roboticCar.roboticCarLocation}")
    }

}
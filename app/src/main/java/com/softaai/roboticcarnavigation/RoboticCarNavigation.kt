package com.softaai.roboticcarnavigation

/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */


fun main() {

    println("Robotic Car Navigation Test")

    RoboticCarController.navigateCar(
        RoboticCar(
            RoboticCarLocation(
                Position(1, 2),
                FacingDirection("N")
            )
        ), "LMLMLMLMM"
    )  // 1 3 N   if test pass
    RoboticCarController.navigateCar(
        RoboticCar(
            RoboticCarLocation(
                Position(3, 3),
                FacingDirection("E")
            )
        ), "MMRMMRMRRM"
    )      // 5 1 E  if test pass

}
package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */

data class RoboticCar(var x:Int, var y: Int, var direction: String){
    override fun toString(): String {
        return "Car current position is ($x, $y) and facing towards $direction"
    }
}

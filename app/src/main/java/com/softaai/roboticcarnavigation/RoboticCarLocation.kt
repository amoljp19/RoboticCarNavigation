package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */

data class RoboticCarLocation(
    var position: Position = Position(0, 0),
    var facingDirection: FacingDirection = FacingDirection("N")
) {
    override fun toString(): String {
        return "Robotic Car current location at $position and facing towards $facingDirection"
    }
}

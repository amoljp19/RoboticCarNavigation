package com.softaai.roboticcarnavigation


/**
 * Created by amoljp19 on 9/20/2022.
 * softAai Apps.
 */

/*

Robotic camera cars are to be tested on rectangular ground; the ground must be
navigated by the cars so that their on-board cameras can get a complete view of the
surrounding terrain.
A car's position and location are represented by a combination of x and y co-ordinates
and a letter representing one of the four cardinal compass points. The ground is
divided up into a grid to simplify navigation. An example position might be 0, 0, N,
which means the rover is in the bottom left corner and facing North.
To control a car, the controller sends a simple string of letters. The possible letters are
'L', 'R' and 'M'. 'L' and 'R' makes the car spin 90 degrees left or right respectively,
without moving from its current spot. 'M' means move forward one grid point and
maintain the same heading.
Assume that the square directly North from (x, y) is (x, y+1)

*/

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


////////////////////// break down of problem statement /////////////////////////////////////////////

// we have robotic camera cars need to be tested on rectangular ground, car navigate on ground so that
// it will capture surrounding area through camera on it.

// cars position and location ==> (x, y, {N,S,E,W})
// for simplification ground is divided into grid

// given example position ==> 0, 0, N --> which means rover? (Rover or Robotic Car?), BTW, is at bottom left corner and facing North

// Their is controller who sends set of strings and control car and that string represented with L, R, M
// L -> spin car by 90 degree left and R -> spin right (Note - without moving cars current position)
// M -> move forward by one grid point (note - dont change facing direction while moving)

// assuming moving directly north from (x, y) by one position is (x, y+1)


// Questions
// 1. what size of grid? -> assuming 4 * 4
// 2. what string controller sends? -> lets assume RLRLLMMMLRLLLMMMM
// 3. What will be next position after that string processs? - that need to be calculated or tested --> Tested
// means suppose after certain operation car should be their at perticular position that need to be test


// suppose one usecase is  car at (0, 0) position and facing towards north
// then if controller send message like "LLLL" then it will spin arround itself without moving same goes for "RRRR"
// thats why to move forward we need to pass M containg string. OK
// as car only moving forward using M but navigation means it will move in any directions, so given conditions are just only restrictions

// ok if i consider that in mind "LM" --> from (0,0, N) to left move  means N to left is E

//  directions
//      N
//   E  +  W
//      S


//  Left Spin Mapping is {N->E, E->S, S->W, W->N}
//  Right Spin Mapping is {N->W, W->S, S->E, E->N}

//  moving forwards towards north means y+1
//  moving forwards towards west means  x+1
//  moving forwards towards south means y-1
//  moving forwards towards east means  x-1


// UseCase1 - initial at (0,0, N)
// controller sends string "MRMLR"
// output will be -> car position ? lets calculate
//  0, 1, N
//  0, 1, W
//  1, 1, W
//  1, 1, N
//  1, 1, W

// car at position (1, 1) and facing towards West i.e (1, 1, W)  for "MRMLR" string command.
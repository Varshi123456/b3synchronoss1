package com.example.b3synchronoss.kotlinexample

import com.example.b3synchronoss.Dice

class Player {
}
fun main(){
    val Mydice=Dice(6)
    val rollDice=Mydice.roll()
    println("dice ${Mydice.numsides} with random number $rollDice")
    val luckynumber=2
    when(rollDice){
        1 -> println("oh sorry u rolled 1 ,try again")
        2 -> println("congragulatons you winnnn!!!!!!")
        3 -> println("oh sorry u rolled 3 ,try again")
        4 -> println("oh sorry u rolled 4 ,try again")
        5 -> println("oh sorry u rolled 5 ,try again")
        6 -> println("oh sorry u rolled 6 ,try again")

    }
}
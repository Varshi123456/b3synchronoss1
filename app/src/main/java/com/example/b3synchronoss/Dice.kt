package com.example.b3synchronoss

class Dice(val numsides: Int) {
    var sides =6
    fun roll(): Int {
//        val ranNum= (1..numsides).random()
//        println("random num is $ranNum")
//         return ranNum
        return (1..numsides).random()
    }
}
fun main(){
    val my1dice= Dice(6)
    println(my1dice.sides)
//   var rolledNum = my1dice.roll()
    println("we have rolled ${my1dice.sides} dice ,we got random number as ${my1dice.roll()}")

    val my2dice= Dice(20)
//    var rolledNum1 = my2dice.roll()
    println("we have rolled ${my2dice.sides} dice ,we got random number as ${my2dice.roll()}")
}
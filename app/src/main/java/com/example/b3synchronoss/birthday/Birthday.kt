package com.example.b3synchronoss.birthday

class Birthday {
}


fun main(){

    var age: Int=5
    var timeslayer: Int=3

    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age,timeslayer)
}


fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}


fun printCakeTop(age: Int){
    repeat(age+2){
        print("=")
    }
    println()
}


fun printCakeBottom(age : Int ,layers : Int){
    repeat(layers){
        repeat(age+2){
            print("@")
        }
        println()
    }

}
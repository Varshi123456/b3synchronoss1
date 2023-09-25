package com.example.b3synchronoss.kotlinexample

import kotlin.math.roundToInt

class Examplesss {
}


fun square(x : Int) = x * x

fun operation(): (Int) -> Int = ::square
fun main(){
//    infix fun Int.times(str1: String) = str1.repeat(this)
//    println(5 times "chandrakanth ❤️")


    infix fun String.onto(other: String) = Pair(this, other)
    val mypair = "varshitha" onto "chandrakanth"
    println(mypair)



    operator fun Int.times(str: String) = str.repeat(this)
    println(4 * "chandrakanth  " )


    operator fun String.get(range: IntRange) = substring(range)
    val y = " hello world"
    println(y[1 ..4])



    fun printAll(vararg message : String){
        for (m in message) println(m)
    }
printAll("hello","hi")



    fun printAllWithPrefix(vararg message : String,prefix : String){
        for (m in message) println(prefix + m)
    }

    printAllWithPrefix("hii","varsha", prefix = "good morning ")



    fun log(vararg msg : String){
        printAll(*msg)
    }
    log("byeee","okkkkk")



    var nullAble : String? = "hello guys"
//    nullAble = null
    println(nullAble)
    fun strLength(notNull: String): Int {
        return  notNull.length
    }
    if (nullAble != null) {
     println(strLength(nullAble))
    }



        infix fun Int.hyp(num: Int) {

            println((this * this) + (num * num))
        }
    3 hyp 9


    infix fun Double.plus(num : Int){
        println(this + num )
    }
3.5 plus 9
    println(2.times(3))
    println(3.5.plus(10))
    println(2.4.div(2))

    val i : Int = 9


    fun <T> MutableList<T>.swap(index1: Int, index2: Int){
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    val list = mutableListOf("hello","hi","k")
     println(list)
    list.swap(1,2)
    println(list)



    fun calculate (
            fpar : Int,
             spar : Int,
            operation : (Int, Int) -> Int) : Int{
                return operation(fpar,spar)
            }
  fun sum(x : Int, y : Int)= x+y


    val sumresult =  calculate(2,5, ::sum)
    val divResult =  calculate(4,2,{a , b -> a / b})
println("$sumresult , $divResult")



    val func = operation()
    println(func(8))


   val lower : (String) -> String = {str: String -> str.lowercase()}
   val lower1 : (String) -> String = {str -> str.uppercase()}
    val itkey : (String) -> String = {it.replace('a','v',true)}
   val lower2 : (String) -> Int = { str : String -> str.length}
    val doublecolon : (String) -> String = String::reversed
     println( lower("VARSHA"))
    println(lower1("varsha"))
    println("String length ${lower2("helllllllo")}")
    println("${itkey("jhsgshajksxjaaa")}")
    println("${doublecolon("varsha")}")

val cov : (Float) -> Int = {it.roundToInt()}
    println( cov(3.4F))




    val sum : (Float,Float) -> Int ={ k,f -> (k+f).roundToInt()}
    println(sum(3.7F,9.1F))

}

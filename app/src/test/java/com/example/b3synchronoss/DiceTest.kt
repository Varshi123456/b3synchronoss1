package com.example.b3synchronoss

import junit.framework.TestCase

class DiceTest : TestCase() {

    fun testRoll() {
        val dice=Dice(6)
        val diceroll = dice.roll()
        assertTrue("number is  between 1 - 6  ",diceroll in (1..6))
    }
}
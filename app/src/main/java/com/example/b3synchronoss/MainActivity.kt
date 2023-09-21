package com.example.b3synchronoss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener(){
            rollDice()
         rollButton.text="rolled"
        }
    }
    fun rollDice(){
        val toast=Toast.makeText(this,"dice rolled",Toast.LENGTH_SHORT)
        toast.show()
         val dice=Dice(6)
         val diceRoll=dice.roll()

        val resultTextView: TextView= findViewById(R.id.textView5)
        resultTextView.text= diceRoll.toString()
    }

}
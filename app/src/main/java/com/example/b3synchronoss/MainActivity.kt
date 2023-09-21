package com.example.b3synchronoss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val ivDice:ImageView= findViewById(R.id.imageView3)
         val diceRoll=dice.roll()
        ivDice.setImageResource(R.drawable.dice_1)

//        when(diceRoll){
//            1->ivDice.setImageResource(R.drawable.dice_1)
//        }

        val Imagetobeset=when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->{0}

        }
        ivDice.setImageResource(Imagetobeset)

        val resultTextView: TextView= findViewById(R.id.textView5)
        resultTextView.text= diceRoll.toString()
    }

}
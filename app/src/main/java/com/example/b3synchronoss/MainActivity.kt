package com.example.b3synchronoss

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.lang.NullPointerException


class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG,"hello")

        logging()
        var rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener(){
            rollDice()
         rollButton.text="rolled"
//

        }

    }
    fun logging(){

        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
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
        throw  NullPointerException ("out of app")

    }

}
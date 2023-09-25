package com.example.b3synchronoss

import android.icu.text.NumberFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.b3synchronoss.databinding.ActivityTipBinding
lateinit var binding: ActivityTipBinding

class TipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip)

//   binding = ActivityTipBinding.inflate((layoutInflater))
//        setContentView(binding.root)
        binding = ActivityTipBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttoncal.setOnClickListener{
            calculateTip()
            binding.buttoncal.text = " calculatedd"
        }

    }

  private  fun calculateTip() {
        val stringInTextField = binding.costOfServiceEditText.toString()
      val cost = stringInTextField.toDouble()
      val selectedId =  binding.tipOption.checkedRadioButtonId
      val percentage = when(selectedId){
          R.id.amazing_option -> 0.20
          R.id.good_option -> 0.18
          else -> 0.15
      }
      var tip = percentage * cost
      val roundup = binding.switch1.isChecked
      if(roundup){
          tip = kotlin.math.ceil(tip)
      }
      val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.calresult.text = getString(R.string.tip_amount , formattedTip)
    }


}
//
// private   fun calculateTip() {
//        TODO("Not yet implemented")
//        //val stringInTextField = binding.costOfService.text.toString()
//        val stringInTextField = binding.editTextNumber.text.toString()
//      val cost = stringInTextField.toDouble()
//      val selectedId =  binding.tipOption.checkedRadioButtonId
//      val percentage = when(selectedId){
//          R.id.amazing_option -> 0.20
//          R.id.good_option -> 0.18
//          else -> 0.15
//      }
//      var tip = percentage * cost
//      val roundup = binding.switch1.isChecked
//      if(roundup){
//          tip = kotlin.math.ceil(tip)
//      }
//      val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//      //binding.calResult.text
//
//
//}


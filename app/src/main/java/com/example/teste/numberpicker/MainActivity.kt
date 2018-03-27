package com.example.teste.numberpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Populate NumberPicker values from minimum and maximum value range
        //Set the minimum value of NumberPicker
        npicker_moedas.minValue = 1
        //Specify the maximum value/number of NumberPicker
        npicker_moedas.maxValue = 100

        //Gets whether the selector wheel wraps when reaching the min/max value.
        npicker_moedas.wrapSelectorWheel = true

        //Set a value change listener for NumberPicker
        npicker_moedas.setOnValueChangedListener { picker, oldVal, newVal ->
            //Display the newly selected number from picker
            txt_quant_moedas.text = "Limite de moedas: " + newVal

        }

    }
}

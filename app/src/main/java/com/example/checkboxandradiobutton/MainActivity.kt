package com.example.checkboxandradiobutton

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnorder = findViewById<Button>(R.id.btnOrder)
        var tvText2 = findViewById<TextView>(R.id.tvText2)
        val rGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val rbId =rGroup.checkedRadioButtonId
        val rbChecked = findViewById<RadioButton>(rbId)
        val cb1 = findViewById<CheckBox>(R.id.cbPanOni)
        val cb2 = findViewById<CheckBox>(R.id.cbCoOni)
        val cb3 = findViewById<CheckBox>(R.id.cbSpiOli)

        btnorder.setOnClickListener{
            val Paneer = cb1.isChecked
            val Corn = cb2.isChecked
            val Spinach = cb3.isChecked

            val order = "Your pizza is ${rbChecked.text} in size and with toppings : " +
                     (if(Paneer) "\nPaneer" else ""  ) +
                    (if(Corn) "\nCorn" else ""  ) +
                    (if(Spinach) "\nSpinach" else ""  )

            tvText2.text = order

        }


    }
}
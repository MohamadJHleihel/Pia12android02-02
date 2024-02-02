package com.example.pia12android02_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var minsiffre = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mintext =findViewById<TextView>(R.id.Fancytext)
        mintext.text = "bananaaa"

        var minknapp = findViewById<Button>(R.id.button)
        minknapp.setOnClickListener {

            minsiffre = minsiffre + 1

            mintext.text = minsiffre.toString() }




    }
}
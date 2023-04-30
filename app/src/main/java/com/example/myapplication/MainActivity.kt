package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton = findViewById<TextView>(R.id.clickButton)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val menuButton = findViewById<ImageView>(R.id.menuButton)

        clickButton.setOnClickListener {
            var number = numberTextView.text.toString().toInt()
            number += 15
            numberTextView.text = number.toString()
        }

        menuButton.setOnClickListener {
            Toast.makeText(this, "congrats!", Toast.LENGTH_LONG).show()
        }

    }
}
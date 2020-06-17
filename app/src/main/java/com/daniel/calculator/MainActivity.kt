package com.daniel.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    // Called when the user taps the Calculate! button
    fun calculateYaBoomer(view: View) {
        // Do something in response to button
        val textView = findViewById(R.id.theResult) as TextView

        val text = findViewById<View>(R.id.entryOne) as EditText
        val firstInput = text.text.toString().toFloat()

        val textTwo = findViewById<View>(R.id.entryTwo) as EditText
        val secondInput = textTwo.text.toString().toFloat()

        val total = firstInput + secondInput

        textView.setText(total.toString())
    }


}

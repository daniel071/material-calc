package com.daniel.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    // Called when the user taps the Calculate! button
    fun calculateYaBoomer(view: View) {
        // If you ever need to log, use this: Log.d("thisWasSelected", currentOperation);

        val spinner: Spinner = findViewById(R.id.operationSpinner)
        val currentOperation = spinner.getSelectedItem().toString();

        // Do something in response to button
        val textView = findViewById(R.id.theResult) as TextView

        val text = findViewById<View>(R.id.entryOne) as EditText
        val firstInput = text.text.toString().toFloat()

        val textTwo = findViewById<View>(R.id.entryTwo) as EditText
        val secondInput = textTwo.text.toString().toFloat()

        var total = 0f

        if (currentOperation == "Add") {
            total = firstInput + secondInput
        } else if (currentOperation == "Subtract") {
            total = firstInput - secondInput
        } else if (currentOperation == "Multiply") {
            total = firstInput * secondInput
        } else if (currentOperation == "Divide") {
            total = firstInput / secondInput
        }


        textView.setText(total.toString())
    }


}

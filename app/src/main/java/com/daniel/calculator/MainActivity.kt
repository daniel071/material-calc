package com.daniel.calculator

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


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

    // Called when someone presses the Copy to Clipboard button
    fun copyToClipboard(view: View) {
        val textView = findViewById(R.id.theResult) as TextView
        val theValue = textView.getText().toString()

        val toastTextClipboard = "Copied to Clipboard"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, toastTextClipboard, duration)
        toast.show()

        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText(label.toString(), theValue)
        clipboard.setPrimaryClip(clip)

    }


}

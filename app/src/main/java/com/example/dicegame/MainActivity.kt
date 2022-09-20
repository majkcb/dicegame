package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    //lateinit var inputView : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.nameView)
       // inputView = findViewById(R.id.inputView) // ta ett värde från/mata in

        textView.text = "Roll the dice to get a number from 1-6" //ändras till slumpad siffra vid knapptryck

        val button = findViewById<Button>(R.id.button) //funktionen nedan körs

        button.text = "Roll Dice"

    }

    fun buttonPressed(view : View) {
       // val name = inputView.text.toString()   // ta det vi matade in i input view och lägga i textview
        val randomInteger = (1..6).shuffled().first()


        textView.text = "You rolled ${randomInteger.toString()}"


    }


}
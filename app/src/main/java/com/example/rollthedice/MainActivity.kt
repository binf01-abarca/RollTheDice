package com.example.rollthedice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageViewDice = findViewById<ImageView>(R.id.imageViewDice)
        val textViewTitle = findViewById<TextView>(R.id.textViewTitle)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val buttonRoll = findViewById<Button>(R.id.buttonRoll)

        imageViewDice.setImageResource(R.drawable.dices)

        buttonRoll.setOnClickListener(View.OnClickListener {
            val userInput = editTextNumber.text.toString()
            val number = userInput.toIntOrNull()

            if (number in 1..6) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NUMERO", number)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Inserisci un numero tra 1 e 6", Toast.LENGTH_SHORT).show()
            }
        })
    }
}

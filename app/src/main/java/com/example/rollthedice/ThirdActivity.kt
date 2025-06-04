package com.example.rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val resultText = intent.getStringExtra("RESULT") ?: "Errore"
        val diceRoll = intent.getIntExtra("DICE_ROLL", -1)

        val imageViewFinal = findViewById<ImageView>(R.id.imageViewFinal)
        val textViewFinal = findViewById<TextView>(R.id.textViewFinal)

        val resource = when (diceRoll) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> R.drawable.dices
        }

        imageViewFinal.setImageResource(resource)
        textViewFinal.text = resultText
    }
}

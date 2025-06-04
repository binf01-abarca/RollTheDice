package com.example.rollthedice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val userNumber = intent.getIntExtra("NUMERO", -1)
        val imageViewDiceSecond = findViewById<ImageView>(R.id.imageViewDiceSecond)
        val textViewSecond = findViewById<TextView>(R.id.SecodnTextView)
        val buttonRollSecond = findViewById<Button>(R.id.buttonRollSecond)

        imageViewDiceSecond.setImageResource(R.drawable.dices)
        textViewSecond.text = "Hai scelto il numero $userNumber"

        buttonRollSecond.setOnClickListener {
            val diceRoll = Random.nextInt(1, 7)

            val resultText = if (diceRoll == userNumber) {
                "Hai vinto! È uscito $diceRoll"
            } else {
                "Hai perso! È uscito $diceRoll"
            }

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("RESULT", resultText)
            intent.putExtra("DICE_ROLL", diceRoll)
            startActivity(intent)
        }
    }
}

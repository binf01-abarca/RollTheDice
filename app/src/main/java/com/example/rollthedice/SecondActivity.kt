package com.example.rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val numEstratto = intent.getIntExtra("NUMERO", -1)
        val textViewTitle = findViewById<TextView>(R.id.SecodnTextView)
        textViewTitle.text = "${textViewTite.text} $ numEstratto"

        val imageViewSecond = findViewById<ImageView>(R.id.SecondViewDice)
        imageViewSecond.setImageResource(
            resources.getIdentifier("dice_face_$numEstratto", "drawable", packageName)
        )


        }
    }
}
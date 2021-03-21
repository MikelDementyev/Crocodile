package com.example.crocodile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewGameCommandsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game_commands)

        val backButton: Button = findViewById(R.id.back_button)

        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}
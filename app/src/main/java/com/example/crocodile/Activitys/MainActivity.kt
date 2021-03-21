package com.example.crocodile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNewGame: Button = findViewById(R.id.new_game)
        val rules: Button = findViewById(R.id.rules)

        buttonNewGame.setOnClickListener {
            val intent = Intent(this, NewGameCommandsActivity::class.java)
            startActivity(intent)
        }

        rules.setOnClickListener {
            val intent = Intent(this, RulesActivity::class.java)
            startActivity(intent)
        }
    }
}
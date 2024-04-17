package edu.temple.startingserviceslabactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val COUNTDOWN_START_VALUE = "countdown start value"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val startButton = findViewById<Button>(R.id.startButton)

        startButton.setOnClickListener {
            startService(Intent(this, CountdownTimerService::class.java)
                .putExtra(COUNTDOWN_START_VALUE, editTextNumber.text.toString().toInt()))
        }
    }
}
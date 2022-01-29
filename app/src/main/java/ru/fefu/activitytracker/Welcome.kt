package ru.fefu.activitytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    private lateinit var welcome_reg: Button
    private lateinit var welcome_log: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        welcome_reg = findViewById(R.id.welcome_reg)
        welcome_log = findViewById(R.id.welcome_log)

        welcome_reg.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }

        welcome_log.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}
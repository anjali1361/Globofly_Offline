package com.anjali.globofly.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.anjali.globofly.R

class WelcomeActivity : AppCompatActivity() {

    lateinit var message:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        message = findViewById(R.id.message)

        // To be replaced by retrofit code
        message.text = "Black Friday! Get 50% cash back on saving your first spot."
    }

    fun getStarted(view: View) {
        val intent = Intent(this, DestinationListActivity::class.java)
        startActivity(intent)
        finish()
    }
}
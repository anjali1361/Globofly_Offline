
package com.anjali.globofly.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.anjali.globofly.R
import com.anjali.globofly.helpers.SampleData
import com.anjali.globofly.models.Destination

class DestinationCreateActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var btn_add:Button
    lateinit var et_city:EditText
    lateinit var et_description:EditText
    lateinit var et_country:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destiny_create)

        toolbar = findViewById(R.id.toolbar)
        btn_add = findViewById(R.id.btn_add)
        et_city = findViewById(R.id.et_city)
        et_country = findViewById(R.id.et_country)
        et_description = findViewById(R.id.et_description)

        setSupportActionBar(toolbar)
        val context = this

        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_add.setOnClickListener {
            val newDestination = Destination()
            newDestination.city = et_city.text.toString()
            newDestination.description = et_description.text.toString()
            newDestination.country = et_country.text.toString()

            // To be replaced by retrofit code
            SampleData.addDestination(newDestination)
            finish() // Move back to DestinationListActivity
        }
    }
}
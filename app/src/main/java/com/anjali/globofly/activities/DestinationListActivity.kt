package com.anjali.globofly.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.anjali.globofly.R
import com.anjali.globofly.helpers.DestinationAdapter
import com.anjali.globofly.helpers.SampleData

class DestinationListActivity : AppCompatActivity() {

    lateinit var toolbar:androidx.appcompat.widget.Toolbar
    lateinit var fab:FloatingActionButton
    lateinit var destiny_recycler_view:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destiny_list)

        toolbar = findViewById(R.id.toolbar)
        fab = findViewById(R.id.fab)

        setSupportActionBar(toolbar)
        toolbar.title = title
        destiny_recycler_view = findViewById(R.id.destiny_recycler_view)

        fab.setOnClickListener {
            val intent = Intent(this@DestinationListActivity, DestinationCreateActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        loadDestinations()
    }

    private fun loadDestinations() {

        // To be replaced by retrofit code
        destiny_recycler_view.adapter = DestinationAdapter(SampleData.DESTINATIONS)
    }
}
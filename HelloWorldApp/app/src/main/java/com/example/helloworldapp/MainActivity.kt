package com.example.helloworldapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showDetailsButton = findViewById<Button>(R.id.showDetailsButton)
        val detailsTextView = findViewById<TextView>(R.id.detailsTextView)

        showDetailsButton.setOnClickListener {
            if (detailsTextView.visibility == View.VISIBLE) {
                detailsTextView.visibility = View.GONE
            } else {
                detailsTextView.visibility = View.VISIBLE
            }
        }
    }
}

package com.example.appbanco

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleServicioActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalleservicioactivity)

        val image = findViewById<ImageView>(R.id.detail_image)
        val title = findViewById<TextView>(R.id.detail_title)
        val description = findViewById<TextView>(R.id.detail_description)

        val imageRes = intent.getIntExtra("IMAGE", 0)
        val titleText = intent.getStringExtra("TITLE")
        val descText = intent.getStringExtra("DESC")

        image.setImageResource(imageRes)
        title.text = titleText
        description.text = descText
        val btnvolver = findViewById<ImageButton>(R.id.btn_logout)
        btnvolver.setOnClickListener {
            startActivity((Intent(this, ServiciosActivity::class.java)))
        }
    }
}
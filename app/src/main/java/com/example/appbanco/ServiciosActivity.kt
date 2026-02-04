package com.example.appbanco

import ItemAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.appbanco.data.Datasource

class ServiciosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.servicios_activity)

        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
        val btnvolver = findViewById<ImageButton>(R.id.btn_logout)
        btnvolver.setOnClickListener {
            startActivity((Intent(this, MenuActivity::class.java)))
        }

    }
}
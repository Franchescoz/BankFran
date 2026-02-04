package com.example.appbanco

import android.icu.text.RelativeDateTimeFormatter
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appbanco.adapter.ItemAdapter2
import com.example.appbanco.data.DataFAQ
import com.example.appbanco.data.Datasource

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_activity)

        val tvSaldo = findViewById<TextView>(R.id.tv_saldo)
        tvSaldo.text = "€ %.2f".format(Saldo.saldo)

        val btnvolver = findViewById<ImageButton>(R.id.btn_logout)
        btnvolver.setOnClickListener {
            finish()
        }


        val recyclerView = findViewById<RecyclerView>(R.id.recycler_movimientos)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val dataList = DataFAQ().loadFAQ()
        val adapter = ItemAdapter2(this,dataList)
        recyclerView.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.tv_saldo)
            .text = "€ %.2f".format(Saldo.saldo)
    }
}

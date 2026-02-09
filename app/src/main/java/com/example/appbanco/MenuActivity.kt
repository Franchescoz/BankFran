package com.example.appbanco

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menu_activity)

        val btnServicios = findViewById<Button>(R.id.btn_servicios)
        btnServicios.setOnClickListener {
            startActivity(Intent(this, ServiciosActivity::class.java))
        }

        val btnPerfil = findViewById<Button>(R.id.btn_perfil)
        btnPerfil.setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }
        val btnTransferir = findViewById<Button>(R.id.btn_transferencias)
        btnTransferir.setOnClickListener {
            startActivity((Intent(this, TransferenciaActivity::class.java)))
        }
        val btnvolver = findViewById<ImageButton>(R.id.btn_logout)
        btnvolver.setOnClickListener {
            startActivity((Intent(this, SessionActivity::class.java)))
        }
        val btnTelefono = findViewById<ImageButton>(R.id.Telefono)
        btnTelefono.setOnClickListener {
            val phoneUri = Uri.parse("tel:912345678")
            val intent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(intent)
        }
        val btnUbicacion = findViewById<ImageButton>(R.id.ubicacion)
        btnUbicacion.setOnClickListener {
            val locationUri = Uri.parse("geo:0,0?q=BBVA Sevilla")
            val intent = Intent(Intent.ACTION_VIEW, locationUri)
            startActivity(intent)
        }


    }
}

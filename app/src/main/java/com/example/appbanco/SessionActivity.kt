package com.example.appbanco

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import kotlin.jvm.java

class SessionActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.sesion_activity)
        val cuenta = findViewById<EditText>(R.id.cuenta)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val nombrecuenta = cuenta.text.toString()
            val passwordInput = passwordEditText.text.toString()

            if (nombrecuenta == "Francisco" && passwordInput == "Fran1234") {

                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
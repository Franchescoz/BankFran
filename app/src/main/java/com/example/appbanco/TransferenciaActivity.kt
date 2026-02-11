package com.example.appbanco

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.appbanco.databinding.ActivityMainBinding
import com.example.appbanco.databinding.TransferenciaActivityBinding
import java.text.NumberFormat

class TransferenciaActivity: AppCompatActivity() {
    private lateinit var binding: TransferenciaActivityBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding= TransferenciaActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{calculateTip()}
        val btnvolver = findViewById<ImageButton>(R.id.btn_logout)
        btnvolver.setOnClickListener {
            startActivity((Intent(this, MenuActivity::class.java)))
        }
    }

    fun calculateTip() {

     
        val cuentaDestino = binding.editCuentaDestino.text.toString()
        if (cuentaDestino.isEmpty()) {
            binding.editCuentaDestino.error = "Introduce la cuenta destino"
            binding.editCuentaDestino.requestFocus()
            return
        }

        val stringInTextField = binding.plainTextInput.text.toString()
        if (stringInTextField.isEmpty()) {
            binding.plainTextInput.error = "Introduce una cantidad válida"
            binding.plainTextInput.requestFocus()
            return
        }

        val cost = stringInTextField.toDouble()

        val selectedId = binding.tipo.checkedRadioButtonId
        val porcentaje = when (selectedId) {
            R.id.paypal4 -> 0.04
            R.id.bbca18 -> 0.18
            else -> 0.15
        }

        var cantidadTransferida = cost + (porcentaje * cost)

        if (binding.roundUpSwitch.isChecked) {
            cantidadTransferida = kotlin.math.ceil(cantidadTransferida)
        }


        if (Saldo.saldo - cantidadTransferida < 0) {
            binding.transferido.text = "Saldo insuficiente"
            return
        }


        Saldo.saldo -= cantidadTransferida

        val formatted = NumberFormat.getCurrencyInstance().format(cantidadTransferida)
        binding.transferido.text = getString(R.string.cantidad, formatted)
    }



}

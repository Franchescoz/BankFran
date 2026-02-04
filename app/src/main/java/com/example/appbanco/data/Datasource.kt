package com.example.appbanco.data


import com.example.appbanco.R
import com.example.appbanco.model.Servicios

class Datasource {
    fun loadAffirmations(): List<Servicios>{
        return listOf<Servicios>(
            Servicios(R.string.affirmation1,R.drawable.tarjetacredito,R.string.descripcion_tarjeta_credito),
            Servicios(R.string.affirmation2,R.drawable.cuentaahorro,R.string.descripcion_cuenta_ahorro),
            Servicios(R.string.affirmation3,R.drawable.tarjetajoven,R.string.descripcion_tarjeta_joven),
            Servicios(R.string.affirmation4,R.drawable.tarjetajubilado,R.string.descripcion_tarjeta_jubilado)

        )
    }
}
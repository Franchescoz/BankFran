package com.example.appbanco.data

import com.example.appbanco.R
import com.example.appbanco.model.PreguntasFrecuentes

class DataFAQ {

    fun loadFAQ(): List<PreguntasFrecuentes> {
        return listOf(
            PreguntasFrecuentes(R.string.faq_1_desc),
            PreguntasFrecuentes(R.string.faq_2_desc),
            PreguntasFrecuentes(R.string.faq_3_desc),
            PreguntasFrecuentes(R.string.faq_4_desc),
            PreguntasFrecuentes(R.string.faq_5_desc),
            PreguntasFrecuentes(R.string.faq_6_desc),
            PreguntasFrecuentes(R.string.faq_7_desc),
            PreguntasFrecuentes(R.string.faq_8_desc),
            PreguntasFrecuentes(R.string.faq_9_desc),
            PreguntasFrecuentes(R.string.faq_10_desc)
        )
    }
}

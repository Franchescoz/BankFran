package com.example.appbanco.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appbanco.R
import com.example.appbanco.model.PreguntasFrecuentes

class ItemAdapter2 (private val context: Context, private val dataset: List<PreguntasFrecuentes>) : RecyclerView.Adapter<ItemAdapter2.ItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

            val adapterLayout = LayoutInflater.from(parent.context)

                .inflate(R.layout.list_item2, parent, false)

            return ItemViewHolder(adapterLayout)

        }



    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

            val item = dataset[position]

            holder.textView.text =  context.resources.getString(item.stringResourceId)

        }

        override fun getItemCount() = dataset.size

        class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

            val textView: TextView = view.findViewById(R.id.item_title)

        }

    }

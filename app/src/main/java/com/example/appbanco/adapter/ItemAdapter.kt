import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appbanco.DetalleServicioActivity
import com.example.appbanco.R

import com.example.appbanco.model.Servicios


class ItemAdapter(private val context: Context, private val dataset: List<Servicios>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)

            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)

    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.textView.text =  context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceID)
        holder.button.setOnClickListener {
            val intent = Intent(context, DetalleServicioActivity::class.java)

            intent.putExtra("IMAGE", item.imageResourceID)
            intent.putExtra("TITLE", context.getString(item.stringResourceId))
            intent.putExtra("DESC", context.getString(item.descriptionResId))

            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView=view.findViewById(R.id.item_image)
        val button: View = view.findViewById(R.id.btn_mas_info)

    }

}
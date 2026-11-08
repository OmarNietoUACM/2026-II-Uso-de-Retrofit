package com.example.a2026_ii_uso_retrofit.ui

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a2026_ii_uso_retrofit.data.FotoMarte
import com.example.a2026_ii_uso_retrofit.databinding.ItemLayoutBinding

class FotosMarteAdapter (val listaFotosMarte: List<FotoMarte>):
    RecyclerView.Adapter<FotosMarteAdapter.FotosMarteHolder>()
{

    class FotosMarteHolder(val itemBinding: ItemLayoutBinding):
        RecyclerView.ViewHolder(itemBinding.root)
    {
        fun llenarItemView(fotoMarte: FotoMarte)
        {
            itemBinding.tvIdfoto.text = fotoMarte.id + "  URL: " + fotoMarte.imgSrc.toString()
                .takeLast(34)

            Glide.with(itemView.context)
                .load(Uri.parse(fotoMarte.imgSrc))
                .into(itemBinding.ivFoto)
            //TODO: agregar imagen
        }
    }



    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): FotosMarteHolder {

            val itemBinding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),
                parent, false)

            return FotosMarteHolder(itemBinding)
    }

    override fun onBindViewHolder(
        holder: FotosMarteHolder,
        position: Int
    ) {
        val fotoMarte = listaFotosMarte[position]
        holder.llenarItemView(fotoMarte)
    }


    override fun getItemCount(): Int = listaFotosMarte.size
}
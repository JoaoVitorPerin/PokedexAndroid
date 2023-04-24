package com.example.pokedexprova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PokemonAdapter(private val items: List<Pokemon?>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_pokemon_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        item?.let { holder.bindView(it) }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindView(item: Pokemon) = with(itemView){
            val imgPkm = findViewById<ImageView>(R.id.imgPokemon)
            val nomePkm = findViewById<TextView>(R.id.txtPokemon)

            item?.let{
                Glide.with(itemView.context).load(it.imageUrl).into(imgPkm)
                nomePkm.text = "${item.name}"
            }


        }
    }
}
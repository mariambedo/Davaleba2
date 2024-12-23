package com.example.mariam_bedineishvili_davaleba2.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.mariam_bedineishvili_davaleba2.R
import com.example.mariam_bedineishvili_davaleba2.Recipe
import com.google.android.material.snackbar.Snackbar

class RVAdapter(val datalist: List<Recipe>): RecyclerView.Adapter<RVAdapter.MyViewHolder>(){

    class MyViewHolder(v: View): RecyclerView.ViewHolder(v){
        var recipies:Recipe ?= null

        init {
            itemView.setOnClickListener {
                Snackbar.make(itemView,recipies.toString(), Snackbar.LENGTH_SHORT).show()
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val recipe = datalist[position]
        holder.recipies = recipe
        val name = holder.itemView.findViewById<TextView>(R.id.name)
        val time = holder.itemView.findViewById<TextView>(R.id.time)
        val difficulty = holder.itemView.findViewById<TextView>(R.id.sirtule)
        val imgUrl = holder.itemView.findViewById<ImageView>(R.id.photo)
        val saati = holder.itemView.findViewById<ImageView>(R.id.saati)
        val saxe = holder.itemView.findViewById<ImageView>(R.id.emocia)

        name.text = recipe.name
        time.text = recipe.time
        difficulty.text = recipe.difficulty
        imgUrl.setImageURI(recipe.imgURL.toUri())
        saati.setImageURI(recipe.saati.toUri())
        saxe.setImageURI(recipe.saxe.toUri())
    }
}
package com.driuft.random_pets_starter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DogAdapter(val dogList: MutableList<String>) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    class DogViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val dogImage: ImageView


        init{
            dogImage = view.findViewById(R.id.dog_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder { //modified this line
        val view = LayoutInflater.from(parent.context).inflate(R.layout.dog_item, parent,false)
        return DogViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dogList.size
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) { //modifying this for a second
       Glide.with(holder.itemView)
           .load(dogList[position])
           .placeholder(R.drawable.img)
           .centerCrop()
           .into(holder.dogImage)

    }


}
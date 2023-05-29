package com.example.hw_2_6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_2_6.databinding.ItemImgRecievedBinding
import com.example.hw_2_6.loadImage
import com.example.hw_2_6.model.Gallery

class RecievedAdapter : RecyclerView.Adapter< RecievedAdapter.SelectViewHolder>() {

    private val listresult = arrayListOf<Gallery>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectViewHolder {
        return SelectViewHolder(
            ItemImgRecievedBinding.inflate(
                LayoutInflater.from(parent.context),parent,
            false))
    }

    override fun onBindViewHolder(holder: SelectViewHolder, position: Int) {
        holder.bind(listresult[position])
    }

    override fun getItemCount(): Int {
        return listresult.size
    }
    fun setImages(images : ArrayList<Gallery>){
        listresult.addAll(images)
        notifyDataSetChanged()
    }
    inner class SelectViewHolder(private val binding: ItemImgRecievedBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(gallery: Gallery) {
            binding.imgResult.loadImage(gallery.image)

        }

    }
}
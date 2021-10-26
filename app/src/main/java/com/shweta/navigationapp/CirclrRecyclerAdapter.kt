package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shweta.navigationapp.databinding.CircleRecyclerviewBinding
import com.shweta.navigationapp.databinding.CircleRecyclerviewItemBinding

class CirclrRecyclerAdapter(val list:List<CircleData>):
    RecyclerView.Adapter<CirclrRecyclerAdapter.CircleRecyclerViewHolder>() {
    class CircleRecyclerViewHolder(val binding:CircleRecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CircleRecyclerViewHolder {
        val binding=CircleRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CircleRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CircleRecyclerViewHolder, position: Int) {
        with(holder)
        {
            binding.textView.text=list[position].text

        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
package com.shweta.navigationapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shweta.navigationapp.databinding.BrickItemGridBinding

class GridAdapter(val list:List<Int>): RecyclerView.Adapter<GridAdapter.GridViewHolder>() {
    class GridViewHolder(val binding:BrickItemGridBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val binding=BrickItemGridBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        binding.root.setOnClickListener {
            val i = Intent(parent.context, BrickInfoActivity::class.java)
            parent.context.startActivity(i)
        }
        return GridViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return list.size
    }
}
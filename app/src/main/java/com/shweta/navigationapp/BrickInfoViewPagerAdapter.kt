package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shweta.navigationapp.databinding.InfoBrickViewpagerBinding

class BrickInfoViewPagerAdapter(val list:List<Int>): RecyclerView.Adapter<BrickInfoViewPagerAdapter.BrickViewHolder>() {
    class BrickViewHolder(val binding: InfoBrickViewpagerBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrickViewHolder {
       val binding=InfoBrickViewpagerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BrickViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BrickViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
       return list.size
    }
}
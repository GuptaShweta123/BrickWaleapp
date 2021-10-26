package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shweta.navigationapp.databinding.OneFragxmentItemBinding

class OneFragmentAdapter(val list:List<ViewPagerData>): RecyclerView.Adapter<OneFragmentAdapter.OneFragmentViewHolder>() {
    class OneFragmentViewHolder(val binding:OneFragxmentItemBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneFragmentViewHolder {
        val binding=OneFragxmentItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return OneFragmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OneFragmentViewHolder, position: Int) {
      with(holder)
      {
        binding.dataText.text=list[position].data
      }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
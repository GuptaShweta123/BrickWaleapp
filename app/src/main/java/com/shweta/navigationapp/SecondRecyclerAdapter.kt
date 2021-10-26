package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shweta.navigationapp.databinding.ItemBlogBinding
import com.shweta.navigationapp.databinding.ItemRecyclerBinding
import com.shweta.navigationapp.databinding.ItemRecyclerSecondBinding
import com.squareup.picasso.Picasso

class SecondRecyclerAdapter(val list:List<SecondRecyclerData>,val viewTypeReceived:Int):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val VIEW_ONE=1
        const val VIEW_TWO=2
        const val VIEW_THREE=3
    }
    inner class SecondViewHolder1(val binding:ItemRecyclerBinding):RecyclerView.ViewHolder(binding.root)
    {
        fun bind(position:Int)
        {

        }
    }
    inner class SecondViewHolder2(val binding:ItemRecyclerSecondBinding):RecyclerView.ViewHolder(binding.root)
    {
        fun bind(position:Int)
        {
       // binding.productText.text=list[position].text
        }
    }
    inner class SecondViewHolder3(val binding:ItemBlogBinding):RecyclerView.ViewHolder(binding.root)
    {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType== VIEW_ONE)
        {
            return SecondViewHolder1(ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }
        else if(viewType== VIEW_TWO) {
            return SecondViewHolder2(
                ItemRecyclerSecondBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
        else
            return SecondViewHolder3(
                ItemBlogBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return viewTypeReceived
    }
}


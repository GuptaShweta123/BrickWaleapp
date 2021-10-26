package com.shweta.navigationapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shweta.navigationapp.databinding.SingleRecyclerlistBinding

class MainRecyclerAdapter(val context: Context, val list:List<MainRecyclerData>) : RecyclerView.Adapter<MainRecyclerAdapter.MainRecyclerViewHolder>() {


   inner class MainRecyclerViewHolder(val binding: SingleRecyclerlistBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
        val binding =
            SingleRecyclerlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) {
       with(holder)
       {
         binding.textHorizontal.text=list.get(position).title
          binding.secondRecyclerview.adapter=SecondRecyclerAdapter(list[position].secondDataList,list[position].viewType)
           binding.secondRecyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
          binding.secondRecyclerview.setHasFixedSize(true)
           binding.secondTextHorizontal.setOnClickListener {
               Toast.makeText(context,"Shweta",Toast.LENGTH_LONG).show()
               val i = Intent(context, GridLRecyclerView::class.java)
               context.startActivity(i)
               //(activity as Activity?)!!.overridePendingTransition(0, 0)
           }
       }
    }

    override fun getItemCount(): Int {
       return list.size
    }
    interface Listener
    {
      fun data(view:View)
    }
}
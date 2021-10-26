package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.shweta.navigationapp.databinding.ItemStateDataBinding

class StateSelectAdapter(val list:List<StateData>,val listener:DataListener): RecyclerView.Adapter<StateSelectAdapter.StateSelectViewHolder>() {
    lateinit var binding:ItemStateDataBinding
    class StateSelectViewHolder(val binding: ItemStateDataBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateSelectViewHolder {
        binding= ItemStateDataBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        binding.root.setOnClickListener {
            val string=binding.stateText.text
            listener.getData(string.toString())
            Toast.makeText(parent.context,string,Toast.LENGTH_SHORT).show()
        }
        return StateSelectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StateSelectViewHolder, position: Int) {
    with(holder)
    {
     binding.stateText.text=list[position].state
    }
    }

    override fun getItemCount(): Int {
       return list.size
    }
    interface DataListener
    {
        fun getData(str:String)
    }
}
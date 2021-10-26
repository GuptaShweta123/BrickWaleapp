package com.shweta.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.shweta.navigationapp.databinding.ActivityGridLrecyclerViewBinding

class GridLRecyclerView : AppCompatActivity() {
    lateinit var binding:ActivityGridLrecyclerViewBinding
    lateinit var gridAdapter: GridAdapter
    val list=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGridLrecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data=data()
        binding.gridRecyclerView.layoutManager=GridLayoutManager(this,2)
        gridAdapter=GridAdapter(data)
        binding.gridRecyclerView.adapter=gridAdapter
    }
    fun data(): List<Int> {
        list.add(R.drawable.flower1)
        list.add(R.drawable.flower2)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower1)
        list.add(R.drawable.flower2)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        return list
    }
}
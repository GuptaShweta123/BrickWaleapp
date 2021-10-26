package com.shweta.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.shweta.navigationapp.databinding.FragmentOneBinding


class OneFragment : Fragment() {
  lateinit var binding:FragmentOneBinding
  lateinit var oneFragmentAdapter: OneFragmentAdapter
  private val list=ArrayList<ViewPagerData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val data=data()
        binding= FragmentOneBinding.inflate(layoutInflater,container,false)
        binding.viewPagerRecycler.layoutManager=LinearLayoutManager(activity)
       oneFragmentAdapter=OneFragmentAdapter(data)
        binding.viewPagerRecycler.adapter=oneFragmentAdapter
        return binding.root
    }
fun data():List<ViewPagerData>
{
    val data=ViewPagerData("List")
    val data1=ViewPagerData("FeatureList")
    list.add(data)
    list.add(data1)
    return list
}

}
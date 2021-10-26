package com.shweta.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.tabs.TabLayoutMediator
import com.shweta.navigationapp.databinding.ActivityBrickInfoBinding
import androidx.viewpager.widget.ViewPager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout


class BrickInfoActivity : AppCompatActivity() {
    lateinit var binding:ActivityBrickInfoBinding
    lateinit var brickInfoViewPagerAdapter: BrickInfoViewPagerAdapter
    private val list=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding= ActivityBrickInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data=data()
       brickInfoViewPagerAdapter= BrickInfoViewPagerAdapter(data)
        binding.vpPager.adapter=brickInfoViewPagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.vpPager) { tab, position ->

        }.attach()
        binding.cartImage.setOnClickListener {
            val intent= Intent(this,CartDetailActivity::class.java)
            startActivity(intent)
        }


        val adapter=MyAdapter(supportFragmentManager,lifecycle)

        binding.viewPager2.adapter=adapter

        TabLayoutMediator(binding.tabs,binding.viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="INFO"
                }
                1->{
                    tab.text="HIGHLIGHTS"
                }

            }
        }.attach()





    }
    fun data(): List<Int> {
        list.add(R.drawable.flower1)
        list.add(R.drawable.flower2)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        list.add(R.drawable.flower4)
        return list
    }
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(OneFragment(),"INFO")
        adapter.addFragment(TwoFragment(), "HIGHLIGHTS")
        viewPager.setAdapter(adapter)
    }
    internal class ViewPagerAdapter(manager: FragmentManager?) :
        FragmentPagerAdapter(manager!!) {
        private val mFragmentList: MutableList<Fragment> = ArrayList()
        private val mFragmentTitleList: MutableList<String> = ArrayList()
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mFragmentTitleList[position]
        }
    }
}
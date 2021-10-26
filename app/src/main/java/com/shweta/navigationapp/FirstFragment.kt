package com.shweta.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.shweta.navigationapp.databinding.FragmentFirstBinding
import android.app.Activity

import android.content.Intent





class FirstFragment : Fragment() {
   lateinit var binding:FragmentFirstBinding
    private var list = ArrayList<Int>()
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    lateinit var circlrRecyclerAdapter: CirclrRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentFirstBinding.inflate(layoutInflater,container,false)
       val data=data()
        viewPagerAdapter= ViewPagerAdapter(data)
        binding.vpPager.adapter=viewPagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.vpPager) { tab, position ->
            //Some implementation
        }.attach()
        val circleDataList=circleData()
        binding.circleLayout.circleRecyclerView.layoutManager=LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        binding.circleLayout.circleRecyclerView.adapter=CirclrRecyclerAdapter(circleDataList)
        binding.mainRecyclerview.layoutManager=LinearLayoutManager(activity)
        val list=prepareData()
        mainRecyclerAdapter= MainRecyclerAdapter(requireActivity(),list)
        binding.mainRecyclerview.adapter=mainRecyclerAdapter

        return binding.root
    }
    fun data(): List<Int> {
        list.add(R.drawable.flower1)
        list.add(R.drawable.flower2)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        return list
    }
    fun circleData():List<CircleData>
    {
        val circleDaataList=ArrayList<CircleData>()
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg","Awal"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg","Naram Awal"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg","Awal"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg","Naram Awal"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg","Awal"))

        return circleDaataList



    }
    fun prepareData():List<MainRecyclerData> {
        /* val data1=SecondRecyclerData("shwetagupta")
         val data2=SecondRecyclerData("shweta")
         val data3=SecondRecyclerData("shweta")
         val data4=SecondRecyclerData("shweta")
         val dataList=ArrayList<SecondRecyclerData>()
         dataList.add(data1)
         dataList.add(data2)
         dataList.add(data3)
         dataList.add(data4)
         return dataList*/
        // val secondRecyclerData1=SecondRecyclerData("AnuragSingh")
        val secondRecyclerData1 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg")
        val secondRecyclerData2 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/easyicecreamcake_300d8c35460.jpg")
        val secondRecyclerData3 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/chocolatechipcookiedoughsandwichcookies44ee0.jpg")
        val secondRecyclerData4 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/smorescheesecakeaf8f.jpg")
        val secondRecyclerDataList=ArrayList<SecondRecyclerData>()
        secondRecyclerDataList.add(secondRecyclerData2)
        secondRecyclerDataList.add(secondRecyclerData1)
        secondRecyclerDataList.add(secondRecyclerData3)
        secondRecyclerDataList.add(secondRecyclerData4)
        val secondRecyclerData5 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg")
        val secondRecyclerData6 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/easyicecreamcake_300d8c35460.jpg")
        val secondRecyclerData7 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/chocolatechipcookiedoughsandwichcookies44ee0.jpg")
        val secondRecyclerData8 = SecondRecyclerData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/smorescheesecakeaf8f.jpg")
        val secondRecyclerDataList1=ArrayList<SecondRecyclerData>()
        secondRecyclerDataList1.add(secondRecyclerData2)
        secondRecyclerDataList1.add(secondRecyclerData1)
        secondRecyclerDataList1.add(secondRecyclerData3)
        secondRecyclerDataList1.add(secondRecyclerData4)

        //val secondRecyclerData5 = SecondRecyclerData("rashi")
        //val secondRecyclerData6 = SecondRecyclerData("ansh")
        // val secondRecyclerDataList1=ArrayList<SecondRecyclerData>()
        //secondRecyclerDataList1.add(secondRecyclerData5)
        //secondRecyclerDataList1.add(secondRecyclerData6)
        // val mainRecyclerData1=MainRecyclerData("BrickWall",secondRecyclerDataList1)
        val mainRecyclerData=MainRecyclerData("Top Searches",SecondRecyclerAdapter.VIEW_ONE,secondRecyclerDataList)
        val mainRecyclerData1=MainRecyclerData("featured products",SecondRecyclerAdapter.VIEW_TWO,secondRecyclerDataList)
        val mainRecyclerData2=MainRecyclerData("Our Blogs",SecondRecyclerAdapter.VIEW_THREE,secondRecyclerDataList1)

        val mainrecyclerDataList=ArrayList<MainRecyclerData>()
        mainrecyclerDataList.add(mainRecyclerData)
        mainrecyclerDataList.add(mainRecyclerData1)
        mainrecyclerDataList.add(mainRecyclerData2)
        // mainrecyclerDataList.add(mainRecyclerData1)
        return mainrecyclerDataList
    }

   /* override fun data(view: View) {
        val i = Intent(activity, GridLRecyclerView::class.java)
        startActivity(i)
        (activity as Activity?)!!.overridePendingTransition(0, 0)
    }*/

}
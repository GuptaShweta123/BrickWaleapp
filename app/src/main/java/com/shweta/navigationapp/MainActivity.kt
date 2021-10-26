package com.shweta.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.shweta.navigationapp.databinding.ActivityMainBinding
import me.relex.circleindicator.CircleIndicator

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
   // lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var drawerLayout: DrawerLayout
    lateinit var binding: ActivityMainBinding
  //  lateinit var viewPagerAdapter: ViewPagerAdapter
   /* lateinit var circleIndicator: CircleIndicator
    lateinit var mainRecyclerAdapter: MainRecyclerAdapter
    lateinit var circlrRecyclerAdapter: CirclrRecyclerAdapter
    lateinit var viewModel:ViewPagerViewModel*/
    private var list = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*setSupportActionBar(binding.layout.toolbar)
        binding.layout.toolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24)*/
        val navController = this.findNavController(R.id.myNavHostFragment)
       binding.navView.itemIconTintList=null
       /* appBarConfiguration =
            AppBarConfiguration.Builder(R.id.top_menu, R.id.second).setDrawerLayout(binding.drawerLayout)
                .build()*/
       // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        NavigationUI.setupWithNavController(binding.navView, navController)

        /*navController=findNavController(R.id.navHostFragment)

        drawerLayout=binding.drawerLayout
        NavigationUI.setupWithNavController(binding.navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)*/
        val dataList = data()
       /* viewPagerAdapter = ViewPagerAdapter()
        binding.vpPager.adapter = viewPagerAdapter
        TabLayoutMediator(binding.tabLayout, binding.vpPager) { tab, position ->
            //Some implementation
        }.attach()

        binding.mainRecyclerview.layoutManager=LinearLayoutManager(this)
        val list=prepareData()
        mainRecyclerAdapter= MainRecyclerAdapter(this,list)
        binding.mainRecyclerview.adapter=mainRecyclerAdapter

       val circleDataList=circleData()
       binding.circleLayout.circleRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.circleLayout.circleRecyclerView.adapter=CirclrRecyclerAdapter(circleDataList)*/

         //binding.circleIndicator.setViewPager(binding.vpPager)
        val apiInterface = ApiInterface.getInstance()
        val recipeRepository = ViewPagerRepository(apiInterface)
       /* viewModel = ViewModelProvider(
            this,MyViewModelFactory(recipeRepository)
        )
            .get(ViewPagerViewModel::class.java)
       viewModel.getAllImages()
        viewModel.recipeMutbleLiveData.observe(this, Observer {
           viewPagerAdapter.update(it)
        })*/
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(
            navController,binding.drawerLayout
        ) || super.onSupportNavigateUp()
    }
    fun openCloseNavigationDrawer(view: View?) {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }
   /* override fun onSupportNavigateUp(): Boolean {
        // val navController = this.findNavController(R.id.navHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }*/

    fun data(): List<Int> {
        list.add(R.drawable.flower1)
        list.add(R.drawable.flower2)
        list.add(R.drawable.flower3)
        list.add(R.drawable.flower4)
        return list
    }
   /* fun circleData():List<CircleData>
    {
       val circleDaataList=ArrayList<CircleData>()
       circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg"))
        circleDaataList.add(CircleData("https://res.cloudinary.com/dk4ocuiwa/image/upload/v1575163942/RecipesApi/5928474985_19b4ba972a_z4fd1.jpg"))

   return circleDaataList



    }*/

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
}
package com.shweta.navigationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shweta.navigationapp.databinding.ItemBinding
import kotlin.system.exitProcess

class ViewPagerAdapter(val recipeList:List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.PageViewHolder>() {
    //var recipeList=ArrayList<Recipe>()
    inner class PageViewHolder(val binding:ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PageViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PageViewHolder, position: Int) {
        val recipe=recipeList.get(position)
/*with(holder)
{
   // binding.imageView.setImageResource(list[position])

recipe?.image_url.let {
    Glide.with(binding.imageView.context).load(recipe.image_url)
        .into(binding.imageView)
}*/
//}
    }
  /*fun update(list:List<Recipe>)
  {
      recipeList.clear()
      for(i in 0..5) {
          recipeList.add(list.get(i))
      }
      notifyDataSetChanged()

  }*/

    override fun getItemCount(): Int {
        return recipeList.size
    }
}
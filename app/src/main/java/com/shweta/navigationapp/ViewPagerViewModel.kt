package com.shweta.navigationapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class ViewPagerViewModel(private val repository: ViewPagerRepository): ViewModel() {
var job: Job?=null
    val recipeMutbleLiveData=MutableLiveData<List<Recipe>>()
    fun getAllImages()
    {
job= CoroutineScope(Dispatchers.IO).launch {
val response=repository.getAllRecipes()
withContext(Dispatchers.Main)
{
if(response?.isSuccessful!!)
{
recipeMutbleLiveData.value=response?.body()?.recipes
    Log.d("Message...","Success..."+response.body()?.recipes)
}
}
}
    }
}
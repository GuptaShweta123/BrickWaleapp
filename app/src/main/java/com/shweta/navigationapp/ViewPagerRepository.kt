package com.shweta.navigationapp

import com.shweta.navigationapp.ApiInterface.Companion.apiInterface

class ViewPagerRepository(apiInterface: ApiInterface) {
    suspend fun getAllRecipes()=apiInterface?.getRecipes("","",'r',1)
}
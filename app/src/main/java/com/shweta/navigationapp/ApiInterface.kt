package com.shweta.navigationapp


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit
val BaseUrl = "https://recipesapi.herokuapp.com/api/"
interface ApiInterface {
    @GET("search")
   suspend fun getRecipes(
        @Query("key") key: String,
        @Query("q") query: String,
        @Query("sort") sortType: Char,
        @Query("page") page: Int = 1
    ): Response<ReceipeData>
   /* companion object
    {
    private val apiInterface:Retrofit by lazy {
        val logger = HttpLoggingInterceptor()
        logger.level = HttpLoggingInterceptor.Level.BASIC

        val client = OkHttpClient.Builder()
            .readTimeout(15000L, TimeUnit.MILLISECONDS)
            .addInterceptor(logger)
            .build()

        Retrofit.Builder()
            .baseUrl(BaseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
        fun create(): ApiInterface = apiInterface.create(
            ApiInterface::class.java
        )

    }*/
   companion object {
       var apiInterface: ApiInterface? = null
       fun getInstance() : ApiInterface {
           if (apiInterface == null) {
               val retrofit = Retrofit.Builder()
                   .baseUrl(BaseUrl)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build()
               apiInterface = retrofit.create(ApiInterface::class.java)
           }
           return apiInterface!!
       }

   }
}
package com.shweta.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shweta.navigationapp.databinding.ActivityLoginCompleteBinding

class LoginCompleteActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginCompleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginCompleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
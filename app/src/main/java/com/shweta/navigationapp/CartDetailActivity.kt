package com.shweta.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shweta.navigationapp.databinding.ActivityCartDetail1Binding
import com.shweta.navigationapp.databinding.ActivityCartDetailBinding

class CartDetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityCartDetail1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCartDetail1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.arrowDownImage.setOnClickListener {
            val intent= Intent(this,AddressActivity::class.java)
            startActivity(intent)
        }

    }
}
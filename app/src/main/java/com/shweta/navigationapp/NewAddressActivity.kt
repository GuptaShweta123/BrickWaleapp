package com.shweta.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shweta.navigationapp.databinding.ActivityNewAddressBinding

class NewAddressActivity : AppCompatActivity() {
    lateinit var binding:ActivityNewAddressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNewAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {
            val intent= Intent(this,AddressActivity::class.java)
            startActivity(intent)
        }
    }
}
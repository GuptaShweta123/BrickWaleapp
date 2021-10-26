package com.shweta.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shweta.navigationapp.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    lateinit var binding:ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
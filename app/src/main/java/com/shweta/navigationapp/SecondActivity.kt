package com.shweta.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shweta.navigationapp.databinding.ActivitySecondBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)
        CoroutineScope(Dispatchers.Main).launch {
            delay(1000L)
           val intent = Intent(applicationContext,PopUpActivity::class.java)
            startActivity(intent)
        }
    }
}
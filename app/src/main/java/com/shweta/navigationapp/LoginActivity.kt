package com.shweta.navigationapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import com.shweta.navigationapp.databinding.ActivityLogin2Binding
import com.shweta.navigationapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
       /* window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        actionBar?.hide()*/
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            colorText()
        }

    }
    private fun colorText()
    {
        val str=binding.tvEnd.text
        val ss: SpannableString = SpannableString(str)
        val color: ForegroundColorSpan = ForegroundColorSpan(Color.RED)
        ss.setSpan(color,21,25, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
       binding.tvEnd.text=ss

    }
}
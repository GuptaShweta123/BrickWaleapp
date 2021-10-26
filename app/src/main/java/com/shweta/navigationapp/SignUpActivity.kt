package com.shweta.navigationapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.Toast
import com.shweta.navigationapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
       /* window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        actionBar?.hide()*/
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener {
            val intent= Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"shweta",Toast.LENGTH_LONG).show()
        }
        colorText()
    }
    private fun colorText()
    {
        val str=binding.tvEnd.text
        val ss: SpannableString = SpannableString(str)
        val color: ForegroundColorSpan = ForegroundColorSpan(Color.RED)
        ss.setSpan(color,24,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvEnd.text=ss
        val message=binding.checkBox.text
        val st= SpannableString(message)
        st.setSpan(color,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.checkBox.text=st
    }
}
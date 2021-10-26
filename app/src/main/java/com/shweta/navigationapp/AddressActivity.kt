package com.shweta.navigationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.gson.JsonObject
import com.razorpay.Checkout
import com.razorpay.PaymentResultListener
import com.shweta.navigationapp.databinding.ActivityAddressBinding
import org.json.JSONObject

class AddressActivity : AppCompatActivity(), PaymentResultListener {
    lateinit var binding:ActivityAddressBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val amount="100"
binding.etEditaddress.setOnClickListener {
    val intent= Intent(this,NewAddressActivity::class.java)
    startActivity(intent)
}
        binding.bottomLayout.setOnClickListener{
   paymentOption()


        }

        }
    private fun paymentOption()
    {
        val checkout=Checkout()
        checkout.setKeyID(("rzp_test_CazYoHxfZ9EFAG"))
        checkout.setImage(R.drawable.brick)
        val option=JSONObject()
        option.put("name","Shweta")
        option.put("description","9560526422")
        option.put("theme.color","#FF725E")
        option.put("Currency","INR")
        option.put("amount","5000")
        option.put("prefill.email", "shwetag295@gmail.com")
        option.put("prefill.contact", "9560526422")
        checkout.open(this,option)





    }

    override fun onPaymentSuccess(p0: String?) {
       val alertDialog=AlertDialog.Builder(this).setTitle("Success")
        alertDialog.show()

    }

    override fun onPaymentError(p0: Int, p1: String?) {
      Toast.makeText(applicationContext,"Failure",Toast.LENGTH_SHORT).show()
    }


}


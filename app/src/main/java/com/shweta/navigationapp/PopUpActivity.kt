package com.shweta.navigationapp

import android.content.Intent
import android.graphics.drawable.ClipDrawable.VERTICAL
import android.opengl.Visibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView

import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.shweta.navigationapp.databinding.ActivityPopUpBinding

class PopUpActivity : AppCompatActivity() ,StateSelectAdapter.DataListener{
    lateinit var binding:ActivityPopUpBinding
    lateinit var adapter: StateSelectAdapter
    private var strData=" "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPopUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val languages=resources.getStringArray(R.array.Languages)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val stateData=stateData()
       /* binding.recyclerView.addItemDecoration(DividerItemDecoration(applicationContext, DividerItemDecoration.HORIZONTAL).apply {
            setDrawable(getDrawable(applicationContext, R.drawable.separator)!!)
        })*/
        adapter=StateSelectAdapter(stateData,this)
        binding.recyclerView.adapter=adapter
        binding.constraintLayout.setOnClickListener {
            binding.recyclerView.visibility=View.VISIBLE
        }

       /* if(binding.spinner!=null)
        {
            val adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,languages)
            binding.spinner.adapter=adapter
            binding.spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(applicationContext,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                    val intent= Intent(applicationContext,NewAddressActivity::class.java)
                    startActivity(intent)
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }*/
    }
    private fun stateData():List<StateData>
    {
       val list=ArrayList<StateData>()
        list.add(StateData("Delhi"))
        list.add(StateData("Haryana"))
        list.add(StateData("Delhi"))
        list.add(StateData("Haryana"))
        list.add(StateData("Delhi"))
        list.add(StateData("Haryana"))
        list.add(StateData("Delhi"))
        list.add(StateData("Haryana"))
        list.add(StateData("Delhi"))
        list.add(StateData("Haryana"))

        return list
    }

    override fun getData(str:String) {
      strData=str
      binding.selectText.text=strData
        binding.recyclerView.visibility=View.GONE
        val intent=Intent(this,SignUpActivity::class.java)
        startActivity(intent)
    }
}

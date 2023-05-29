package com.example.hw_2_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_2_6.adapter.RecievedAdapter
import com.example.hw_2_6.databinding.ActivitySecondBinding
import com.example.hw_2_6.model.Gallery

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private var adapter: RecievedAdapter = RecievedAdapter()

    var imgselect = ArrayList<Gallery>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
        setAdapter()
        adapter.setImages(imgselect)
    }

    private fun setAdapter() {
        binding.recyclerView2.adapter = adapter
    }

    private fun initView() {
        imgselect =  intent.getSerializableExtra("result") as ArrayList<Gallery>


    }
}
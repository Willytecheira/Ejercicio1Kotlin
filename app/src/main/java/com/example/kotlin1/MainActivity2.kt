package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin1.databinding.ActivityMain2Binding
import com.example.kotlin1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    lateinit var a:String
    lateinit var b:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bt2.setOnClickListener(View.OnClickListener {
            a = binding.Campo1.text.toString()
            b = binding.Campo2.text.toString()

            binding.Campo1.text = b.toString()
            binding.Campo2.text = a.toString()
        })
    }
}
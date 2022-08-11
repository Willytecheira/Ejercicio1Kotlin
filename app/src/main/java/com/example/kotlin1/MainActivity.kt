package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var a:String
    lateinit var b:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        a = binding.Campo1.text.toString()
        b = binding.Campo2.text.toString()

        binding.Campo1.text = b.toString()
        binding.Campo2.text = a.toString()

        binding.bt1.setOnClickListener(View.OnClickListener {
           val act = Intent(this, MainActivity2 ::class.java)
            startActivity(act)
        })



    }
}
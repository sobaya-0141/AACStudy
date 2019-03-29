package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel1 = ViewModelProviders.of(this).get(MainViewModel::class.java)
        val viewModel2 = ViewModelProviders.of(this).get(MainViewModel::class.java)

        println("viewModel1 : $viewModel1")
        println("viewModel2 : $viewModel2")
    }
}

package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel1 = ViewModelProviders.of(this).get("1", MainViewModel::class.java)
        val viewModel2 = ViewModelProviders.of(this).get("2", MainViewModel::class.java)

        println("viewModel1 : $viewModel1")
        println("viewModel2 : $viewModel2")
        // 使い所 https://twitter.com/yanzm/status/1110178338348257280
    }
}

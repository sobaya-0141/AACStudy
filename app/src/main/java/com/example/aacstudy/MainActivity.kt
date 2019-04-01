package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MainViewModel = ViewModelProviders
            .of(this)
            .get(MainViewModel::class.java)

        viewModel.countUpLiveData.observe(this, Observer {
            println(it)
        })
    }
}

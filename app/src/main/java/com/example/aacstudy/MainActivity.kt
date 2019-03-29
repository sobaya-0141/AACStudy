package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(MainFragment(), "MainFragment")
                .commit()
        }

        val viewModel1 = ViewModelProviders.of(this).get(MainViewModel::class.java)

        println("viewModel1 : $viewModel1")
    }
}

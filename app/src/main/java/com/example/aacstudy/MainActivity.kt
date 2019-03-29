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
                .add(MainFragment2.newInstance(1), "MainFragment21")
                .add(MainFragment2.newInstance(2), "MainFragment22")
                .commit()
        }

        val viewModel1 = ViewModelProviders.of(this).get("1", MainViewModel::class.java)
        val viewModel2 = ViewModelProviders.of(this).get("2", MainViewModel::class.java)

        println("viewModel1 : $viewModel1")
        println("viewModel2 : $viewModel2")
    }
}

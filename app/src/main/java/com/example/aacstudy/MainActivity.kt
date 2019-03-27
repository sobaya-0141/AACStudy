package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val liveData = CountUpLiveData()
    private val observer = Observer<Int> { println("observeForever : $it") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveData.observe(this, Observer { println(it) })
        liveData.observeForever(observer)
    }

    override fun onDestroy() {
        super.onDestroy()
        liveData.removeObserver(observer)
    }
}

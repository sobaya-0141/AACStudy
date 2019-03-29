package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MediatorLiveData<Int>()
            .apply {
                val source = CountUpLiveData()
                addSource(source) {
                    if (it < 10) {
                        value = it * it
                    } else {
                        removeSource(source)
                    }
                }
            }
            .observe(this, Observer {
                println(it)
            })
    }
}

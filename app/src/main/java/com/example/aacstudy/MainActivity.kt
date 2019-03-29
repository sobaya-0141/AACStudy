package com.example.aacstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    // onDestroyで消すためにクラス変数にする
    private val countUpLiveData2 = CountUpLiveData2()
    private val observer = Observer<Int> {println("observeForever : $it")}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MediatorLiveData<Int>()
            .apply {
                addSource(countUpLiveData2) {
                    if (it < 10) {
                        value = it * it
                    } else {
                        removeSource(countUpLiveData2)
                    }
                }
            }
            .observeForever(Observer {
                println(it)
            })

        countUpLiveData2.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        countUpLiveData2.stop()
        countUpLiveData2.removeObserver(observer)
    }
}

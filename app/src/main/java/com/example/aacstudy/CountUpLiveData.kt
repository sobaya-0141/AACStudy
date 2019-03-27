package com.example.aacstudy

import android.os.Handler
import androidx.lifecycle.LiveData

class CountUpLiveData : LiveData<Int>() {

    private var count = 0
    private val handler = Handler()
    private val r = Runnable {
        count++
        value = count
        next()
    }

    private fun next() { handler.postDelayed(r, 1000) }

    override fun onActive() { next() }

    override fun onInactive() { handler.removeCallbacks(r) }
}
package com.example.aacstudy

import android.os.Handler
import androidx.lifecycle.LiveData

class CountUpLiveData2 : LiveData<Int>() {

    private var count = 0
    private val handler = Handler()
    private val r = Runnable {
        count++
        value = count
        next()
    }

    private fun next() { handler.postDelayed(r, 1000) }

    fun start() { next() }
    fun stop() { handler.removeCallbacks(r) } }
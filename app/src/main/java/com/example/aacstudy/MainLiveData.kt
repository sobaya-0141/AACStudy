package com.example.aacstudy

import androidx.lifecycle.LiveData

class MainLiveData : LiveData<String>() {

    override fun onInactive() {
        super.onInactive()
        println("onInActive : ${hasActiveObservers()}")
    }

    override fun onActive() {
        super.onActive()
        println("onActive : ${hasActiveObservers()}")
    }
}
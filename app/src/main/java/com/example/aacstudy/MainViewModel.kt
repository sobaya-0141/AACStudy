package com.example.aacstudy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _liveData = MutableLiveData<Int>().apply { value = 0 }
    val liveData: LiveData<Int>
        get() = _liveData

    fun countUp() {
        val count = (_liveData.value ?: 0) + 1
        _liveData.value = count
    }
}
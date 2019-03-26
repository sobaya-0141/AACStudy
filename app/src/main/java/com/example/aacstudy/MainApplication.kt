package com.example.aacstudy

import android.app.Application
import androidx.lifecycle.*

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val lifecycleObserver = object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
            fun onAny(source: LifecycleOwner, event: Lifecycle.Event) {
                println("ON_ANY : ${source.lifecycle.currentState.name}")
            }
        }

        ProcessLifecycleOwner.get()
            .lifecycle.addObserver(lifecycleObserver)
    }
}
package com.example.aacstudy

import android.os.Bundle
import android.os.WorkSource
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lifecycleObserver = object : LifecycleObserver {

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            fun onCreate(source: LifecycleOwner) {
                println("ON_CREATE : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            fun onStart(source: LifecycleOwner) {
                println("ON_START : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            fun onDestroy(source: LifecycleOwner) {
                println("ON_DESTROY : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            fun onPause(source: LifecycleOwner) {
                println("ON_PAUSE : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun onResume(source: LifecycleOwner) {
                println("ON_RESUME : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            fun onStop(source: LifecycleOwner) {
                println("ON_STOP : ${source.lifecycle.currentState.name}")
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
            fun onAny(source: LifecycleOwner, event: Lifecycle.Event) {
                println("ON_ANY : ${source.lifecycle.currentState.name}")
            }
        }

        lifecycle.addObserver(lifecycleObserver)
    }
}

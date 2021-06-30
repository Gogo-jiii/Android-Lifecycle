package com.example.lifecycle;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class Engine implements LifecycleObserver {

    private Context context;

    public Engine(Context context) {
        this.context = context;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void startEngine() {
        Toast.makeText(context, "Engine started.", Toast.LENGTH_SHORT).show();
        Log.d("TAG","Engine started.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void stopEngine() {
        Toast.makeText(context, "Engine stopped.", Toast.LENGTH_SHORT).show();
        Log.d("TAG","Engine stopped.");
    }

}

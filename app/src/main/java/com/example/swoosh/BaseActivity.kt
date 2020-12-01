package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val TAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ${javaClass.simpleName}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${javaClass.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${javaClass.simpleName}")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${javaClass.simpleName}")
    }


    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ${javaClass.simpleName}")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${javaClass.simpleName}")
    }

}
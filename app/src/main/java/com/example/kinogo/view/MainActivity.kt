package com.example.kinogo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kinogo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(com.google.android.material.R.id.container, MainFragment.newInstance())
                .commitNow()


        }
    }
}
package com.corp.alcoforado.soccermatchfinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startRegistration(view:View) {
        var toast = Toast.makeText(applicationContext,getString(R.string.error_need_registration),Toast.LENGTH_LONG)
    }

    fun findAMatch(view:View)
    {
        Log.d("Click me", "for find Match")
        var toast = Toast.makeText(applicationContext,R.string.error_need_registration,Toast.LENGTH_LONG)
        toast.show()
    }
}

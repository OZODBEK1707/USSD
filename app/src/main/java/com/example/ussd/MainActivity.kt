package com.example.ussd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ussd.utils.MyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyData.addTemplate()
    }
}
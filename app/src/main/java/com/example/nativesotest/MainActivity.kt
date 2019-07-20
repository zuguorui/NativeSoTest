package com.example.nativesotest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvContent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvContent = findViewById(R.id.tv_content)
        tvContent.text = nGetStringFromSo()
    }

    external fun nGetStringFromSo(): String

    companion object{
        init {
            System.loadLibrary("native-lib")
        }
    }
}

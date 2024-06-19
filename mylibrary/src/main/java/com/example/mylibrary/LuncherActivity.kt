package com.example.mylibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librarycreater.R

class LuncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luncher)
    }



    fun start()
    {
        startActivity(Intent(this@LuncherActivity,LuncherActivity::class.java))
    }

}
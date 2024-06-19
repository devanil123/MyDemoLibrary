package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast




class ToasterMessage {

    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()

    }

    fun loadFrame(activity: Activity)
    {
        activity.startActivity(Intent(activity,LuncherActivity::class.java))

    }
}
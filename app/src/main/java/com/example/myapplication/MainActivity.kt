package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myBut = findViewById<Button>(R.id.button)
        var t = findViewById<TextView>(R.id.editTextTime)

        myBut.setOnClickListener({ println("王蛋蛋的father") })
    }

    fun test1(V: View) {
        println("王蛋蛋的father")
        // 给bnt1添加点击响应事件
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        //启动
        startActivity(intent)

    }

}


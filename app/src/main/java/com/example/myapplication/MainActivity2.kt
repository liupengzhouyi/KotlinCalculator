package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun test1(V: View) {
        println("王蛋蛋的father")
        // 给bnt1添加点击响应事件
        val intent = Intent(this@MainActivity2, MainActivity::class.java)
        //启动
        startActivity(intent)

    }

    fun app1(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "1")
    }

    fun app2(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "2")
    }

    fun app3(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "3")
    }

    fun app4(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "4")
    }

    fun app5(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "5")
    }

    fun app6(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "6")
    }

    fun app7(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "7")
    }

    fun app8(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "8")
    }

    fun app9(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "9")
    }

    fun app0(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "0")
    }

    fun appp(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + ".")
    }

    fun appjia(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "+")
    }

    fun appjie(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "-")
    }

    fun appcheng(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "*")
    }

    fun appchu(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText(t.text.toString() + "/")
    }

    fun appAC(V: View) {
        var t = findViewById<TextView>(R.id.textView2)
        t.setText("")
    }


}
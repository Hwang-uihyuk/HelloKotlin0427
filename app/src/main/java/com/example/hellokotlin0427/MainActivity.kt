package com.example.hellokotlin0427

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//    var btnHello : Button
  //  val btnHello : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        var intent : Intent //화면을 바꿔줌, 어떤화면으로 갈건가해서 var로 선언해줌
        btnJava.setOnClickListener {
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }
        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(intent)
        }


        }
    }

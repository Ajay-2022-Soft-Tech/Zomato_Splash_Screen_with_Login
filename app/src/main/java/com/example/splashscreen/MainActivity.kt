package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       we have to hide the First activity
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this , SignUp::class.java)
            startActivity(intent)
            finish() // If we want to go back completely from application then type
//            it means activity is finished
        },1500)
    }
}
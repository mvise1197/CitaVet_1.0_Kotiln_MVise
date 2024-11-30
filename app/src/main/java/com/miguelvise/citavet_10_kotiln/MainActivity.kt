package com.miguelvise.citavet_10_kotiln

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btnlogin)
        button.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        /*val btnRegistroActivity: Button = findViewById(R.id.btnregistrar)
        btnRegistroActivity.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }*/
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main Activity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "onStop")
    }
}


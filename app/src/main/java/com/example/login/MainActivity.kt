package com.example.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        supportActionBar!!.hide()


    }

    fun click(v: View) {
        val intent: Intent
        when (v.id) {
            R.id.signin1 -> intent = Intent(this@MainActivity, signupo)
            R.id.signin2 // R.id.textView2
            -> intent = Intent(this, signup)
        }
        startActivity(intent)

    }
}

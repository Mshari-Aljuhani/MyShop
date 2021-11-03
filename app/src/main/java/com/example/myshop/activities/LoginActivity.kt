package com.example.myshop.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import com.example.myshop.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val reg_btn : com.example.myshop.utils.primaryFont = findViewById(R.id.tv_register)

        //to hide the stuts bar. the else statment for older androids
        @Suppress("DEPRECATION")
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        reg_btn.setOnClickListener{
            val intent = Intent(Intent(this@LoginActivity, RegisterActivity::class.java))
            startActivity(intent)
        }
    }
}
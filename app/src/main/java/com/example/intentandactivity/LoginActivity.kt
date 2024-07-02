package com.example.intentandactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : Activity(), View.OnClickListener {

    private lateinit var btnLogin: Button
    private lateinit var textRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi komponen
        btnLogin = findViewById(R.id.BtnLogin)
        textRegister = findViewById(R.id.register)

        // Menetapkan listener
        btnLogin.setOnClickListener(this)
        textRegister.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.BtnLogin -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.register -> {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

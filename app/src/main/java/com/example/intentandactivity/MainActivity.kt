package com.example.intentandactivity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : Activity() {

    private lateinit var btntambah:ImageView
    private lateinit var btnsearch:ImageView
    private lateinit var btnprofil:ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntambah = findViewById(R.id.tomboltambah)
        btnsearch = findViewById(R.id.tombolsearch)
        btnprofil = findViewById(R.id.profile_image)

        btntambah.setOnClickListener{
            val intent = Intent (this, TambahKaryaActivity::class.java)
            startActivity(intent)
        }
        btnsearch.setOnClickListener{
            val intent = Intent (this, SearchActivity::class.java)
            startActivity(intent)
        }
        btnprofil.setOnClickListener{
            val intent = Intent (this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }

}



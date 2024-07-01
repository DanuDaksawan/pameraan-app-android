package com.example.intentandactivity

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
=======
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
>>>>>>> d3858b81b0be092af2311b835fc4c2b5f2ca9d77

class TransaksiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.activity_transaksi)
=======
        enableEdgeToEdge()
        setContentView(R.layout.activity_transaksi)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
>>>>>>> d3858b81b0be092af2311b835fc4c2b5f2ca9d77
    }
}
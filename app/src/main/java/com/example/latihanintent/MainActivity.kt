package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val inputbtn = findViewById<Button>(R.id.inputbtn)

        inputbtn.setOnClickListener {
            val Nim = nim.text.toString()
            val Nama= nama.text.toString()
            val Nilai = nilai.text.toString()

            val intent = Intent(this@MainActivity, activity_kedua2::class.java)
            intent.putExtra("NIM", Nim)
            intent.putExtra("Nama", Nama)
            intent.putExtra("Nilai", Nilai)
            startActivity(intent)

        }
    }
}
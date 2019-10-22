package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_kedua2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua2)
        var intent = intent
        val Nim = intent.getStringExtra("NIM")
        val Nama = intent.getStringExtra("Nama")
        var Nilai = intent.getStringExtra("Nilai")

        val txt_hasil = findViewById<TextView>(R.id.txt_hasil)
        txt_hasil.text = "NIM : "+Nim+"\nNama: "+Nama+"\nNilai: "+Nilai

        val keterangan = findViewById<TextView>(R.id.keterangan)
        val nilaiInt = Nilai.toInt()
        if (nilaiInt >= 80 || nilaiInt == 100) {
            keterangan.text = "Keterangan : A"
        }
        else if (nilaiInt >= 60) {
            keterangan.text = "Keterangan : B"
        }
        else if (nilaiInt >= 40) {
            keterangan.text = "Keterangan : C"
        }
        else if (nilaiInt >= 20) {
            keterangan.text = "Keterangan : D"
        }
        else if (Nilai >= 0.toInt().toString()) {
            keterangan.text = "Keterangan : E"
        }
    }
}
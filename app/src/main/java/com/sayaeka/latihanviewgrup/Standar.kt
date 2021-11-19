package com.sayaeka.latihanviewgrup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Standar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standar)
        supportActionBar?.title = "Tempat Penginapan Standar"
    }
}
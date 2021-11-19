package com.sayaeka.latihanviewgrup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VIP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vip)
        supportActionBar?.title = "Tempat Penginapan VIP"
    }
}
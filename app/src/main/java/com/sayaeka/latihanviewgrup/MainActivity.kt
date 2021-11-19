package com.sayaeka.latihanviewgrup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Tempat Penginapan"

        val btnStandar: Button = findViewById(R.id.btn_standar)
        btnStandar.setOnClickListener(this)

        val btnVip: Button = findViewById(R.id.btn_VIP)
        btnVip.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_standar->{
                val mStandar = Intent(this@MainActivity,Standar::class.java)
                startActivity(mStandar)
            }

            R.id.btn_VIP->{
                val mVip = Intent(this@MainActivity,VIP::class.java)
                startActivity(mVip)
            }
        }
    }
    }


   fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }


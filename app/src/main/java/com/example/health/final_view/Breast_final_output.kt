package com.example.health.final_view

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.health.R

class Breast_final_output : AppCompatActivity() {

    lateinit var toolbar : Toolbar
    lateinit var txtView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breast_final_output)

        toolbar = findViewById(R.id.appbar)
        txtView = findViewById(R.id.txtView)

        setSupportActionBar(toolbar)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.breast)))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        window.statusBarColor = ContextCompat.getColor(this,R.color.breast)








    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home ->{
                val intent = Intent(this,Breast_final_output::class.java)
                startActivity(intent)
                this.finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
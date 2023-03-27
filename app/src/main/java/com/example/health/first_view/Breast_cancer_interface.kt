package com.example.health.first_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.health.MainActivity
import com.example.health.R
import com.example.health.form.form_breast

class Breast_cancer_interface : AppCompatActivity() {

    lateinit var Toolbar : Toolbar
    lateinit var Fill_Details: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breast_camcer_interface)

        Toolbar = findViewById(R.id.appbar)
        Fill_Details = findViewById(R.id.btn_breast_fill_details)

        setSupportActionBar(Toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        Fill_Details.setOnClickListener{
            val intent = Intent(this, form_breast::class.java)
            startActivity(intent)
        }

        window.statusBarColor = ContextCompat.getColor(this, R.color.breast)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home ->{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                this.finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
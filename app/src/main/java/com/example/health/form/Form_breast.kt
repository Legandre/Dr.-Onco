package com.example.health.form

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.health.R
import com.example.health.final_view.Breast_final_output
import com.example.health.first_view.Breast_cancer_interface
import com.google.android.material.textfield.TextInputLayout


class form_breast : AppCompatActivity() {

    lateinit var toolbar : Toolbar
    lateinit var ClickNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breast_form)

        toolbar = findViewById(R.id.appbar)
        ClickNext = findViewById(R.id.btnNext)

        setSupportActionBar(toolbar)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.breast)))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        window.statusBarColor = ContextCompat.getColor(this,R.color.breast)

        ClickNext.setOnClickListener{
            val intent  = Intent(this,Breast_final_output::class.java)
            startActivity(intent)
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home ->{
                val intent = Intent(this, Breast_cancer_interface::class.java)
                startActivity(intent)
                this.finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
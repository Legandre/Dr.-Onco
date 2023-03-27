package com.example.health

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import androidx.core.content.ContextCompat

class splash : AppCompatActivity() {
    lateinit var logo : TextView
    lateinit var logo2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo =  findViewById(R.id.txtLogo)
        logo2 =  findViewById(R.id.txtLogo2)

        logo2.alpha = 0f
        logo.alpha = 0f
        logo.animate().setDuration(2000).alpha(1f).withEndAction{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

        logo2.animate().setDuration(2000).alpha(1f).withEndAction{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

        window.statusBarColor = ContextCompat.getColor(this,R.color.black_shade)
    }
}
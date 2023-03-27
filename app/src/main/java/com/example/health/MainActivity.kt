package com.example.health

import android.annotation.TargetApi
import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.health.first_view.Breast_cancer_interface
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {

    lateinit var CollapsingToolbar:CollapsingToolbarLayout
    lateinit var Breast_cancer:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setStatusBarGradiant(this)

        Breast_cancer = findViewById(R.id.cardBreastCancer)
        CollapsingToolbar = findViewById(R.id.C)

        Breast_cancer.setOnClickListener{
            val intent = Intent(this, Breast_cancer_interface::class.java)
            startActivity(intent)
        }

        CollapsingToolbar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar)

    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    fun setStatusBarGradiant(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = activity.window
            val background = ContextCompat.getDrawable(activity, R.drawable.gra2)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

            window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
            window.navigationBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
            window.setBackgroundDrawable(background)
        }
    }
}
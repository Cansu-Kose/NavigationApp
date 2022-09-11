package com.patika.week3appnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
    override fun onBackPressed() {
        moveTaskToBack(true)
        finish()
    }
}
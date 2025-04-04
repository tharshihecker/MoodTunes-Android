package com.example.moodtunes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Wait for 2 seconds before navigating to GetStartedActivity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
            finish() // Close SplashActivity so the user can't go back to it
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}

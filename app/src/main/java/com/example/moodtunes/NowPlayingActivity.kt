package com.example.moodtunes

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NowPlayingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_now_playing)
    }

    fun goBack(view: View) {
        finish()
    }

    fun openFavorites(view: View) {
        startActivity(Intent(this, FavoritesActivity::class.java))
    }

    // New function for the "Back to Main" button
    fun backToMain(view: View) {
        startActivity(Intent(this, HomeActivity::class.java))
        finish()
    }
}

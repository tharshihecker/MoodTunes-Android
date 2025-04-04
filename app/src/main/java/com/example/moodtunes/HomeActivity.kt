package com.example.moodtunes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        profileImage.setOnClickListener {
            goToProfileActivity()
        }

        val btnHappy = findViewById<Button>(R.id.btn_happy)
        val btnSad = findViewById<Button>(R.id.btn_sad)
        val btnRelaxed = findViewById<Button>(R.id.btn_relaxed)
        val btnEnergetic = findViewById<Button>(R.id.btn_energetic)

        btnHappy.setOnClickListener {
            openPlaylistActivity("Happy")
        }

        btnSad.setOnClickListener {
            openPlaylistActivity("Sad")
        }

        btnRelaxed.setOnClickListener {
            openPlaylistActivity("Relaxed")
        }

        btnEnergetic.setOnClickListener {
            openPlaylistActivity("Energetic")
        }
    }

    private fun goToProfileActivity() {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    private fun openPlaylistActivity(mood: String) {
        val intent = Intent(this, PlaylistActivity::class.java)
        intent.putExtra("MOOD", mood)
        startActivity(intent)
    }
}

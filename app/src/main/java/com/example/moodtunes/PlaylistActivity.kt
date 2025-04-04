package com.example.moodtunes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class PlaylistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.playlist_activity)

        val playlistListView: ListView = findViewById(R.id.playlist_list)

        val playlist = listOf(
            "🎤 Bohemian Rhapsody - Queen",
            "💃 Shape of You - Ed Sheeran",
            "🕺 Billie Jean - Michael Jackson",
            "🔥 Rolling in the Deep - Adele",
            "🎸 Smells Like Teen Spirit - Nirvana",
            "🎺🎶 Uptown Funk - Mark Ronson ft. Bruno Mars",
            "🌟 Blinding Lights - The Weekend",
            "💔 Someone Like You - Adele",
            "✌️🎹 Imagine - John Lennon",
            "🏨🎸 Hotel California - Eagles",
            "⛪ Take Me to Church - Hozier",
            "🙏🎼 Hallelujah - Leonard Cohen",
            "🎸🔥 Sweet Child O' Mine - Guns N' Roses",
            "🎤🏆 Lose Yourself - Eminem",
            "💑🎶 Thinking Out Loud - Ed Sheeran"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, playlist)
        playlistListView.adapter = adapter

        // Handle song click to open NowPlayingActivity
        playlistListView.setOnItemClickListener { _, _, _, _ ->
            startActivity(Intent(this, NowPlayingActivity::class.java))
        }
    }

    fun goBack(view: View) {
        finish()
    }

    fun openFavoritesActivity(view: View) {
        val intent = Intent(this, FavoritesActivity::class.java)
        startActivity(intent)
    }
}

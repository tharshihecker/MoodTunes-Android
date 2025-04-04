package com.example.moodtunes

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class FavoritesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)

        // 1️⃣ Find the ListView
        val favoritesListView: ListView = findViewById(R.id.favorites_list)

        // 2️⃣ Famous songs for favorites list
        val favorites = listOf(
            "Bohemian Rhapsody - Queen 🎵",
            "Shape of You - Ed Sheeran 🎶",
            "Billie Jean - Michael Jackson 🎼",
            "Rolling in the Deep - Adele 🎧",
            "Smells Like Teen Spirit - Nirvana 🎸",
            "Uptown Funk - Mark Ronson ft. Bruno Mars 🥁",
            "Blinding Lights - The Weeknd 🎻",
            "Someone Like You - Adele 🎷"
        )

        // 3️⃣ Set up the adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, favorites)
        favoritesListView.adapter = adapter

        // 4️⃣ Handle item click to navigate to NowPlayingActivity
        favoritesListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, _, _ ->
            val intent = Intent(this, NowPlayingActivity::class.java)
            startActivity(intent)
        }
    }

    // 🔙 Navigate back to MainActivity (Mood Selection)
    fun goToMoodSelection(view: View) {
        val intent = Intent(this, HomeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP // Clears all activities on top
        startActivity(intent)
        finish() // Close the current activity
    }
}

# 🎵 MoodTunes – Android Music App

**MoodTunes** is a simple Android-based music player application developed using **Kotlin**. The app allows users to browse and play local audio files from their device, providing a clean and user-friendly interface for managing music playback.

## 🎯 Project Overview

- Scan and display available songs on the device  
- Play, pause, skip, and resume songs  
- Display song title and duration  
- Lightweight and responsive UI  
- Built using Android media APIs

This app is ideal for learning how to work with media playback in Android, along with file access permissions and basic service handling.

## 🛠️ Tech Stack

- **Kotlin**  
- **MediaPlayer API**  
- **RecyclerView & Adapters**  
- **Runtime Permissions**  
- **Material UI**

## 📁 Project Structure

MoodTunes-Android/
├── activities/ → Main UI screens
├── adapters/ → RecyclerView adapter for music list
├── model/ → Data model for music files
├── utils/ → Media handling and file utilities
└── MainActivity.kt → App launcher and core logic

bash
Copy
Edit

## 🔧 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/tharshihecker/MoodTunes-Android.git
Open the project in Android Studio

Allow Gradle to sync and install dependencies

Run the app on a real device (with audio files) or emulator (with media access)

📌 Permissions: The app requests runtime permission to access external storage for audio file access.
🎧 Recommended to test on a device with media files for full functionality.

📌 Notes
Minimum SDK: 21+ (Lollipop)

App does not use a database; it reads from device storage

Focus is on local media playback, not streaming

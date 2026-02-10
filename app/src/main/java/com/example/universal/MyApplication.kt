package com.example.universal

import android.app.Application
import com.google.firebase.FirebaseApp

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize Firebase using the configuration from google-services.json.
        FirebaseApp.initializeApp(this)
    }
}

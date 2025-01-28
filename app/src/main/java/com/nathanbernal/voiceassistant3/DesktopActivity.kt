package com.nathanbernal.voiceassistant3

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DesktopActivity : ComponentActivity() {

    private var btnItems = emptyArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desktop)

        val btnHola = findViewById<Button>(R.id.btnHola)
        btnHola.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.micontactoes)
        }

    }



}
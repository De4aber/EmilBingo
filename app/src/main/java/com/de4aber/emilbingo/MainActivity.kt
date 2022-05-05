package com.de4aber.emilbingo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.apply {systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) }

        var start = findViewById<Button>(R.id.Start);
        var luk = findViewById<Button>(R.id.Luk);
        start.setOnClickListener { onClickStart() }
        luk.setOnClickListener { onClickLuk() }

    }

    fun onClickStart(){
        val intent = Intent(this, BingoActivity::class.java)
        startActivity(intent);
    }

    fun onClickLuk(){
        finish();
    }
}
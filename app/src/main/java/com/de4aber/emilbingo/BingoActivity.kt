package com.de4aber.emilbingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_bingo.*

class BingoActivity : AppCompatActivity() {

    private val boardViewModel:BoardViewModel by lazy{
        ViewModelProvider(this).get(BoardViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bingo)

        btnBack.setOnClickListener { finish() }
        val currentBoardFragment = supportFragmentManager.findFragmentById(R.id.boardFragment)

        if(currentBoardFragment == null) {
            val fragment = BoardFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.boardFragment, fragment)
                .commit()
            fragment.setupBoard()
        }
    }
}
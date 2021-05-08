package com.buchi.gaminghub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TicTacToeSingle : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // change to view binding (with view binding)
        setContentView(R.layout.activity_tic_tac_toe_single)
    }

    // Navigation components
    fun singlePlayerMode(view: View) {
        startActivity(Intent(this, TicTacToeGame::class.java))
    }
}
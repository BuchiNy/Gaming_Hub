package com.buchi.gaminghub

import android.content.Intent
import android.os.Bundle
import android.view.View

class GameActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // change to view binding (with view binding)
        setContentView(R.layout.activity_game)
    }

    // Navigation components
    fun singlePlayerMode(view: View) {
        startActivity(Intent(this, SinglePlayerActivity::class.java))
    }

    // Navigation components
    fun multiplayerMode(view: View) {

    }
}
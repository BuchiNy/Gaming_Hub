package com.buchi.gaminghub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View) {
        startActivity(Intent(this, GameActivity::class.java))
    }

    fun exit(view: View) {
    }

    // inflates overflow menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.faq -> {
                // code..
                true
            }
            R.id.exit -> {
                // code..
                true
            }
            R.id.game_mode -> {
                // code..
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}
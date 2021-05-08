package com.buchi.gaminghub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import java.lang.System.exit
import kotlin.system.exitProcess

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //button to start the whole application
    fun start(view: View) {
        startActivity(Intent(this, GameActivity::class.java))
    }

    //button to exit the application
    fun exit(view: View) {
        finish()
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
            //switch case statement
            R.id.faq -> {
                // open the FQA window.
                true
            }
            R.id.exit -> {
                // closes the whole application
                true
            }
            R.id.game_mode -> {
                // opens the main game area
                startActivity(Intent(this, GameActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}
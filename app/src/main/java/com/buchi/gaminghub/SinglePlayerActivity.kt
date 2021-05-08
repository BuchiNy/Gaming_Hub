package com.buchi.gaminghub

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SinglePlayerActivity : MainActivity() {
		//Displaying of Single games in list form
    lateinit var singlePlayerGamesRv: RecyclerView

    val games: ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        singlePlayerGamesRv = findViewById(R.id.singlePlayerGames)



        // create a vertical layout manger
        singlePlayerGamesRv.layoutManager = LinearLayoutManager(this)

        // access the recycler adapter and load data into it
        val gameAdapter : GameAdapter

        gameAdapter = GameAdapter(games)

        singlePlayerGamesRv.adapter = gameAdapter

        gameAdapter.notifyDataSetChanged()

        // load games into ArrayList
        loadGames()

        gameAdapter.onItemClick = { game ->

            // do something with your item
            Log.i("TAG", game)
            when (game) {
                "Tic Tac Toe" -> startActivity(Intent(this, TicTacToeSingle::class.java))
                "War Card" -> startActivity(Intent(this, WarGame::class.java))
                else -> Toast.makeText(this, "no game found...", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //Function to add games to the RecyclerView
    private fun loadGames() {
        games.add("Tic Tac Toe")
        games.add("War Card")
    }

}


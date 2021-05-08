package com.buchi.gaminghub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MultiPlayerActivity : MainActivity() {
    //Displaying of Single games in list form
    lateinit var multiPlayerGamesRv: RecyclerView

    val games: ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        multiPlayerGamesRv = findViewById(R.id.singlePlayerGames)

        // load games into ArrayList
        loadGames()

        // create a vertical layout manger
        multiPlayerGamesRv.layoutManager = LinearLayoutManager(this)

        // access the recycler adapter and load data into it
        val gameadapter : GameAdapter

        gameadapter = GameAdapter(games)

        multiPlayerGamesRv.adapter = gameadapter

        gameadapter.notifyDataSetChanged()

    }

    //Function to add games to the RecyclerView
    private fun loadGames() {
        games.add("Tic Tac Toe")

    }
}

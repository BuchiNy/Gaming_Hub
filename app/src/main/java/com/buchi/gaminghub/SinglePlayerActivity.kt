package com.buchi.gaminghub

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SinglePlayerActivity : MainActivity() {
    lateinit var singlePlayerGamesRv: RecyclerView

    val games: ArrayList<String> = ArrayList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_player)

        singlePlayerGamesRv = findViewById(R.id.singlePlayerGames)

        // load games into ArrayList
        loadGames()

        // create a vertical layout manger
        singlePlayerGamesRv.layoutManager = LinearLayoutManager(this)

        // access the recycler adapter and load data into it
        val gameAdapter : GameAdapter

        gameAdapter = GameAdapter(games)

        singlePlayerGamesRv.adapter = gameAdapter

        gameAdapter.notifyDataSetChanged()

    }

    private fun loadGames() {
        games.add("Flappy Bird")
        games.add("Snake")
    }

}
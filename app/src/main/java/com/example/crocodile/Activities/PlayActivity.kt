package com.example.crocodile.Activities

import com.example.crocodile.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crocodile.Adapters.TeamsAdapter
import com.example.crocodile.Adapters.WordsAdapter

class PlayActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<WordsAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)
//
//        val recyclerView: RecyclerView = findViewById(R.id.words_recycler_view)
//        layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = layoutManager
//
//        adapter = WordsAdapter()
//        recyclerView.adapter = adapter
    }
}
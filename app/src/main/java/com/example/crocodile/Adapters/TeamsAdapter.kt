package com.example.crocodile.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crocodile.R

class TeamsAdapter : RecyclerView.Adapter<TeamsAdapter.ViewHolder>(){

    private val teamNames = arrayOf("Маугли", "Атомные самураи", "Атомные самураи",
            "Атомные самураи", "Атомные самураи", "Атомные самураи", "Атомные самураи",
            "Атомные самураи")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var teamName: TextView? = null

        init {
            teamName = itemView.findViewById(R.id.team_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.team_item_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.teamName?.text = teamNames[position]
    }

    override fun getItemCount(): Int {
        return teamNames.count()
    }
}
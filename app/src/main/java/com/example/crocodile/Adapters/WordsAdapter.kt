package com.example.crocodile.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crocodile.R

class WordsAdapter : RecyclerView.Adapter<WordsAdapter.ViewHolder>(){

    private val words = arrayOf("якорь", "штурвал", "парус", "пират", "палуба")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var word: TextView? = null

        init {
            word = itemView.findViewById(R.id.word)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.word_card, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.word?.text = words[position]
    }

    override fun getItemCount(): Int {
        return words.count()
    }
}
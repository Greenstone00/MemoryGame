package com.example.memorygame

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.memorygame.models.BoardSize

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view){
    private val cardNumberTextView: TextView = itemView
        .findViewById(R.id.header_text)

    private val cardCount = BoardSize.EASY
    fun bind(cardCount: Int) {
        cardNumberTextView.text = cardCount.toString()
    }
}
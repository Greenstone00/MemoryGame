package com.example.memorygame.models

data class MemoryCard(
    val identifier: Int,
    var isFaceUp: Boolean = false, //var mert fog változni az állapota
    var isMatched: Boolean = false
)

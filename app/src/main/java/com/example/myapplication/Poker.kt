package com.example.myapplication

fun main() {
    val deck = mutableListOf<Int>()
    val colors = listOf("C", "D", "H", "S")
    for (i in 0 until 52) {
        deck.add(i)
        if (i%13 == 0 && i != 0) println()
        val a = i/13
//        var type = colors[a]

        val type = when (a) {
            0 -> {
                "♣"
            }
            1 -> {
                "♢"
            }
            2 -> {
                "♡"
            }
            else -> "♠"
        }
        print("${(i)%13+1}$type ")
    }
}
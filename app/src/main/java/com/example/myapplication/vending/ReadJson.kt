package com.example.myapplication.vending

import java.net.URL

fun main() {
    val url = URL("https://api.jsonserve.com/AXh1oX")
    val text = url.readText()
    println(text)

    val input = url.openStream()
    val reader = input.bufferedReader()
    var line = reader.readLine()
    while (line != null) {
        println(line)
        line = reader.readLine()
    }
}
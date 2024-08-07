package com.example.myapplication

fun main() {
    val question = "Please enter a number"
    val secret = (1..10).random()
    var num = 0
    var lowerBound = 1
    var upperBound = 10

    while (num != secret) {
        println("$question($lowerBound-$upperBound): ")
        val input = readlnOrNull()
        num = input?.toIntOrNull() ?: 0
        if (num < 1 || num > 10) continue
        if (num < secret) {
            lowerBound = num
        } else if (num > secret) {
            upperBound = num
        } else {
            println("you got it!")
        }
    }
}
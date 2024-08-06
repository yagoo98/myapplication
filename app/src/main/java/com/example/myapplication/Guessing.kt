package com.example.myapplication

fun main() {
    val secret = 7
    var num = 0

    while (num != secret) {
        print("Please enter a number(1-10): ")
        val input = readlnOrNull()
        num = input?.toIntOrNull() ?: 0
        println("The number you entered: $num")
        if (num < secret) {
            println("Bigger")
        } else if (num > secret) {
            println("Smaller")
        } else {
            println("you got it!")
        }
    }
}
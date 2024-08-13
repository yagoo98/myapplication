package com.example.myapplication

import kotlin.random.Random

class GuessGame {
    enum class Status {
        INIT, BIGGER, SMALLER, BINGO
    }
    var secret:Int = Random.nextInt(1,11)
    var counter = 0
    var status = Status.INIT
    fun guess(n:Int) : Status {
        counter++

        return if (secret > n) Status.BIGGER else if (secret < n) Status.SMALLER else Status.BINGO
    }
    fun reset() {
        secret = Random.nextInt(1,11)
        counter = 0
    }
}
//inheritance
//polymorphism
//encapsulation
fun main() {
    val game = GuessGame()
    val num = 3
    val result = game.guess(num)
    game.reset()
}
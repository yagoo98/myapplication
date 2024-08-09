package com.example.myapplication

import kotlin.random.Random
import kotlin.random.nextInt

class GuessGame {
    var secret:Int = Random.nextInt(1,11)
    var counter = 0
    fun guess(n:Int) : Int {
        counter++
        return secret-n
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
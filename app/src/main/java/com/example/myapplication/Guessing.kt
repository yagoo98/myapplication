package com.example.myapplication

fun main() {
    val question = "Please enter a number"
    var num = 0
    var lowerBound = 1
    var upperBound = 10

    val nums = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    nums.shuffle()
    val secret = nums.removeAt(0)
    val bomb = nums.removeAt(0)
    var bingo = false
    var message = "$question($lowerBound-$upperBound): "
    print(message)
    while (num != secret) {
        val input = readlnOrNull()
        num = input?.toIntOrNull() ?: 0

        message = when {
            num < 1 || num > 10 -> "out of range"
            num == bomb -> {
                bingo=true
                "bomb"
            }
            num < secret -> {
                lowerBound = num
                "$question($lowerBound-$upperBound): "
            }
            num > secret -> {
                upperBound = num
                "$question($lowerBound-$upperBound): "
            }
            else -> {
                bingo=true
                "you got it!"
            }
        }
        print(message)

        if (bingo) {
            break
        }
    }
}
package com.example.myapplication

fun main() {
    val drinks = mutableMapOf<Int, String>(
        1 to "Coke",
        2 to "Pepsi",
        3 to "BlackTea",
        4 to "Coke",
        Pair(5, "DrPepper")
    )
    drinks[6] = "water"
    println(drinks)
    println(drinks[5])
}
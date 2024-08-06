package com.example.myapplication

fun main() {
    var counter = 0
    counter += 1
    counter++
    println(counter)
    println(10%3)
    println(10/3.0)
    var name:String? = null
    println(name?.length)
    println(name?:"Andrew")
    var a = false
    var b = false
    println(a && b)
    println(a || b)
}
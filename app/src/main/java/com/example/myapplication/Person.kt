package com.example.myapplication

class Person(val weight:Float, val height:Float) {
    fun hello() {
        println("Hello")
    }
//    var weight:Float = 0f
//    var height:Float = 0f
    fun bmi() : Float = weight/(height*height)
    fun bmi0() : Float {
        val bmi = weight/(height*height)
        return bmi
    }
    fun bmi1(height:Float,weight:Float) : Float {
        val bmi = weight/(height*height)
        return bmi
    }
    val bmi2:(Float, Float) -> Float =  {
        height,weight-> weight/(height*height)
    }
    val bmi3 = {
        height: Float, weight: Float -> weight/(height*height)
    }
}
package com.example.myapplication

class Hello {
}
//Gradle自動編譯到下列路徑:
//C:\Users\andrew\AndroidStudioProjects\MyApplication\app\build\tmp\kotlin-classes\debug\com\example\myapplication
//first label,kotlin 的main方法可以不用放在class裡面
fun main() {
    //F8 debug step next
    //F7 debug step into
    //ctrl+P 提示需要的建構子
    //alt+shift+up移動向上一列
    val p = Person(65.5f, 1.7f)
    p.hello()
    println(p.bmi())
//    println(p.bmi0())
//    println(p.bmi1(weight = p.weight, height = p.height))
//    println(p.bmi2(p.height, p.weight))
//    println(p.bmi3(p.height, p.weight))


    //2-1
//    //Byte, Short, Int, Long
//    val age = 10
//    //Long
//    val population = 999L
//    println(age.inc())
//    println(age)
//    var name = "Andrew"
//    //get char
//    println(name.get(1))
//    name = "Jack"
//    println(name)
//    //Float(32), Double(64)
//    //Double
//    val weightDouble = 65.5
//    //Float
//    val weight = 65.5f
//    //true/false
//    val isAdult = true
//    //Char
//    var c = 'A'
//    println("Hello Kotlin!")
}
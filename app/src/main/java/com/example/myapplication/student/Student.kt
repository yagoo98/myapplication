package com.example.myapplication.student

open class Student(val id:String, val name:String, var english:Int =0, var math:Int = 0) {
//    constructor(id:String, name:String):this(id, name, 0, 0)
    companion object {
        var pass = 60
    }
    var pass = 50
    open fun print() {
        val mark = if(average()<pass)"*" else " "
        println("$id\t$name\t$english\t$math\t${average()}${mark}\t${grading()}")
    }

    fun average():Int {
        return (english+math)/2
    }

    fun grading() = when(average()/10) {
        9,10 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }
}
fun main() {
    val students = listOf<Student>(
        Student("001","Andrew",100,100),
        Student("002","Sophie",90,90),
        Student("003","Pei")
    )
    println("static pass: ${Student.pass}")
    println("valid pass: ${students[0].pass}")

    for (student in students) {
        student.print()
    }

}
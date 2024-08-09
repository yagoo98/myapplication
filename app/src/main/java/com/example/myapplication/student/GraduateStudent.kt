package com.example.myapplication.student

//繼承必須讓父類別open
class GraduateStudent (id:String, name:String, english:Int, math:Int, val thesis:Int):Student(id, name, english, math) {
    //override覆寫方法必須:傳入,傳出參數相同
    override fun print() {
        val mark = if(average()<pass)"*" else " "
        println("$id\t$name\t$english\t$math\t${average()}${mark}\t${grading()}\t$thesis")
    }
}

fun main() {
    val gstu = GraduateStudent("008","Andrew",90,90,85)
    gstu.print()
}
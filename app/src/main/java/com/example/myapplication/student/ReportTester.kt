package com.example.myapplication.student

fun main() {
    val reports = listOf(
        FinanceReport(),
        object : Report {
            override fun load() {
                println("ex")
            }

            override fun print(title: String) {
                println("printing")
            }

        })
    for (report in reports) {
        report.load()
        report.print("Test")
    }
}
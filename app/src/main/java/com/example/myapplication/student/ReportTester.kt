package com.example.myapplication.student

fun main() {
    val reports = listOf(FinanceReport())
    for (report in reports) {
        report.load()
        report.print("Test")
    }
}
package com.example.myapplication.vending

import java.io.File

fun main() {
    val drinks = listOf(
        Drink("Coke",50,40),
        Drink("Pepsi",50,40),
        Drink("BlackTea",20,30),
        Drink("DrPepper",60,50)
    )
    /*
    //java.IO內的功能
    val out = File("order.txt").printWriter()
    for (d in drinks) {
        //寫入file
        out.println("${d.name},${d.sugar},${d.price}")
    }
    //執行flush後才會存檔
    out.flush()
     */
    //java.IO內的功能
    val out = File("order.txt").bufferedWriter()
    for (d in drinks) {
        //寫入file
        out.write("${d.name},${d.sugar},${d.price}\n")
    }
    //執行flush後才會存檔
    out.flush()

}
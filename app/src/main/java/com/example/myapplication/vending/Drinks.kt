package com.example.myapplication.vending

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
    val tea = Drink("wulong",0,20)
    println(tea)
    //複製更改屬性
    val tea1 = tea.copy(sugar = 5)
    println(tea1)
    val juiceName = "orange juice"
    println("${juiceName.validate(5)}")
    val discountTea = tea.sale20off()
    println(discountTea)

}

fun Drink.sale20off():Drink {
    return this.copy(price= (this.price * .8).toInt())
}
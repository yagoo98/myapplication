package com.example.myapplication.vending

//在class後方沒有寫":"繼承父類別時,其實都自動繼承了java.lang.Object
data class Drink(val name:String, val sugar:Int, val price:Int) {
    //ctrl+o 覆寫快捷鍵
    /*
    override fun toString(): String {
        return "name: $name, sugar: $sugar, price: $price"
    }
     */
}

//extensions擴充方法 直接在要擴充的類別名稱後面加上自定義的方法名稱
fun String.validate(limit:Int):Boolean {
    return this.length<limit
}

package com.andy

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human() //不能再改變的變數
    h.hello()
    var age2 = 19; //變數
    age2 = age2.plus(other = 1); //增加 1
    val age = 19;  //不可改變的值
    var weight = 66.5;
    var name: String;
    name = "Andy"
    print(age2)
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
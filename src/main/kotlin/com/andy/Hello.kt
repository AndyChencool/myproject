package com.andy

fun main() {
//    println("Hello kotlin")
    Human().hello()
    val h = Human() //不能再改變的變數
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
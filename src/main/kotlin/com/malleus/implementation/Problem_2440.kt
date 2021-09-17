package com.malleus.implementation

fun main() {
    val n = readLine()!!.toInt()
    for(i in n downTo 1) {
        for(j in i downTo 1) {
            print("*")
        }
        println()
    }
}
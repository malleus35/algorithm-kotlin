package com.malleus.implementation

fun main() {
    val n = readLine()!!.toInt()
    for(i in n downTo 1) {
        for(j in 1..n) {
            if(i <= j) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
package com.malleus.implementation

fun main() {
    val N = readLine()!!.toInt()
    for(i in N downTo 1) {
        for(j in 1..N) {
            if(i + j <= N) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}
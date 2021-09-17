package com.malleus.io

//import java.io.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine().toInt()
//    for(i in 1..n) {
//        val arr = readLine().split(" ").map { it.toInt() }
//        println("Case #$i: ${arr[0]} + ${arr[1]} = ${arr.sum()}")
//    }
//}

fun main() {
    val n = readLine()!!.toInt()
    for(i in 1..n) {
        val arr = readLine()!!.split(" ").map { it.toInt() }
        println("Case #$i: ${arr[0]} + ${arr[1]} = ${arr.sum()}")
    }
}
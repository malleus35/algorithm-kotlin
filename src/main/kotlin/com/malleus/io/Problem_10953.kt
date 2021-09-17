package com.malleus.io

//import java.io.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine()!!.toInt()
//    for(i in 0 until n) {
//        println(readLine().split(",").sumOf{it.toInt()})
//    }
//}

//import java.io.*
//import java.util.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine()!!.toInt()
//    for(i in 0 until n) {
//        var line = readLine()
//        var st = StringTokenizer(line, ",")
//        println(st.nextToken().toInt().plus(st.nextToken().toInt()))
//    }
//}

//import java.io.*
//import java.util.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine()!!.toInt()
//    for(i in 0 until n) {
//        val line = readLine()
//        val st = StringTokenizer(line, ",")
//        println(st.toList().map { if(it is String) it.toInt() else null }.sumOf { it!! })
//    }
//}

//import java.util.*
//
//fun main() = with(Scanner(System.`in`)) {
//    val n = nextInt()
//    for(i in 0 until n) {
//        var line = next()
//        var st = StringTokenizer(line, ",")
//        println(st.nextToken().toInt() + st.nextToken().toInt())
//    }
//}

fun main() {
    val n = readLine()!!.toInt()
    for(i in 0 until n) {
        println(readLine()!!.split(",").sumOf { it.toInt() })
    }
}
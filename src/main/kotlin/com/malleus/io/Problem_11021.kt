package com.malleus.io

import java.io.*
//import java.util.*

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine().toInt()
//    for(i in 1..n) {
//        val line = readLine()
//        val st = StringTokenizer(line, " ")
//        println("Case #$i: ${st.nextToken().toInt() + st.nextToken().toInt()}")
//    }
//}

//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    val n = readLine().toInt()
//    for(i in 1..n) {
//        println("Case #$i: ${readLine().split(" ").sumOf { it.toInt() }}")
//    }
//}

//fun main() = with(Scanner(System.`in`)) {
//    val n = nextInt()
//    for(i in 1..n) {
//        println("Case #$i: ${nextInt() + nextInt()}")
//    }
//}

fun main() {
    val n = readLine()!!.toInt()
    for(i in 1..n) {
        println("Case #$i: ${readLine()!!.split(" ").sumOf{it.toInt()}}")
    }
}

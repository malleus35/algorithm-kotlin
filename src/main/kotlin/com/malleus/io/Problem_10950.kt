package com.malleus.io

import kotlin.reflect.typeOf

//import java.util.*
//
//fun main(args: Array<String>) = with(Scanner(System.`in`)){
//    var n = nextInt()
//    for(i in 0 until n) {
//        println(nextInt() + nextInt())
//    }
//}

//import java.io.*
//
//fun main(args: Array<String>) {
//    var reader = BufferedReader(InputStreamReader(System.`in`))
//    var n : Int = reader.readLine().toInt()
//
//    for (i in 0 until n) {
//        println(reader.readLine().split(" ").sumOf { it.toInt() })
//    }
//}

fun main() {
    val n = readLine()!!.split(" ")[0].toInt()
    for(i in 0 until n) {
        println(readLine()!!.split(" ").sumOf{it.toInt()})
    }
}
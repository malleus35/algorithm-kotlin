package com.malleus.io

//import java.util.Scanner
//
//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    val first : Int = nextInt()
//    val second : Int = nextInt()
//    println(first + second)
//}

//import java.io.*
//
//fun main(args: Array<String>) {
//    var reader = BufferedReader(InputStreamReader(System.`in`))
//    var first = reader.readLine().toInt()
//    var second = reader.readLine().toInt()
//    println(first + second)
//}

//fun main(args: Array<String>) {
//    println(readLine()!!.split(" ")[0].toInt().let { readLine()!!.split(" ")[0].plus(it) })
//}

import kotlin.io.*

fun main(args: Array<String>) {
    val first : Int = readLine()?.toInt()!!
    val second : Int = readLine()?.toInt()!!
    println(first + second)
}
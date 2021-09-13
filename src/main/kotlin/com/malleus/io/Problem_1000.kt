package com.malleus.io

import java.io.*

fun main(args: Array<String>) {
    BufferedReader(InputStreamReader(System.`in`))
    println(readLine()!!.split(" ").sumOf { it.toInt() })
}

//import java.util.Scanner

//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    println(nextInt() + nextInt())
//}
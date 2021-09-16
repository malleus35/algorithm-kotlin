package com.malleus.io

//import java.io.*
//
//fun main(args: Array<String>) {
//    var reader = BufferedReader(InputStreamReader(System.`in`))
//    var input : String?
//    while((readLine().also { input = it }) != null) {
//        println(input!!.split(" ").sumOf { it.toInt() })
//    }
//}

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    while(hasNextInt()) {
        println(nextInt() + nextInt())
    }
}
package com.malleus.io

//import java.io.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    var input : String?
//    while((readLine().also { input = it }) != null) {
//        println(input!!.split(" ").sumOf { it.toInt() })
//    }
//}

//import java.util.*
//
//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    while(hasNextInt()) {
//        println(nextInt() + nextInt())
//    }
//}

fun main() {
    var line: String?
    while((readLine().also { line = it }) != null) {
        println(line!!.split(" ").sumOf { it.toInt() })
    }
}
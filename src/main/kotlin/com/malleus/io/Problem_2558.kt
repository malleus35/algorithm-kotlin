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
//    val reader = BufferedReader(InputStreamReader(System.`in`))
//    val first = reader.readLine().toInt()
//    val second = reader.readLine().toInt()
//    println(first + second)
//}

//fun main(args: Array<String>) {
//    println(readLine()!!.split(" ")[0].toInt().let { readLine()!!.split(" ")[0].plus(it) })
//}

fun main() {
    println(readLine()!!.toInt() + readLine()!!.toInt())
}
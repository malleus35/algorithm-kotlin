package com.malleus.io

//import java.io.*
//
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//    var str : String?
//    while((readLine().also { str = it }) != null) {
//        var answer = str?.split(" ")?.sumOf{it.toInt()}
//        if(answer != 0) {
//            println(answer)
//        }
//    }
//}

//import java.util.*
//
//fun main() = with(Scanner(System.`in`)) {
//    while(hasNextInt()) {
//        val first = nextInt()
//        val second = nextInt()
//        if (first == 0 && second == 0) {
//            return@with
//        }
//        println(first+second)
//    }
//}

fun main() {
    var str: String?
    while((readLine().also { str = it }) != null) {
        val answer = str!!.split(" ").sumOf { it.toInt() }
        if(answer == 0) {
            break
        }
        println(answer)
    }
}
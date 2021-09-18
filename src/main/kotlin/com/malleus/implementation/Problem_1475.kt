package com.malleus.implementation

fun main() {
    val input = readLine()!!.chunked(1).map { it.toInt() }
    val checkNum = IntArray(10)

    for(i in input) {
        checkNum[i]++
    }
    val sumOfSixNine = checkNum[6] + checkNum[9]
    val avg : Int = if(sumOfSixNine % 2 != 0) sumOfSixNine / 2 + 1 else sumOfSixNine / 2
    checkNum[6] = avg
    checkNum[9] = avg

    println(checkNum.maxOf { it })
}
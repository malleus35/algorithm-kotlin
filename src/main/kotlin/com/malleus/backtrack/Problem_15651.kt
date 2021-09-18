package com.malleus.backtrack

fun main() {
    val input = readLine()!!.split(" ").map{it.toInt()}
    println(Problem_15651(input[0], input[1]).solve())
}

class Problem_15651(private val n : Int, private val m : Int) {
    private val builder = StringBuilder()
    private val arr = IntArray(m)

    fun solve() : String {
        backTrack(0)
        return builder.toString()
    }

    private fun backTrack(depth: Int) {
        if(depth == m) {
            arr.forEach {
                builder.append("$it ")
            }
            builder.append("\n")
            return
        }

        for(i in 0 until n) {
            arr[depth] = i + 1
            backTrack(depth + 1)
        }
    }
}
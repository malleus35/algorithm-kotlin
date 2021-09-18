package com.malleus.backtrack

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    println(Solution(input[0], input[1]).solve())
}

class Solution(private val n : Int, private val m : Int) {
    private val arr = IntArray(m)
    private val visited = BooleanArray(n)
    private val builder = StringBuilder()

    fun solve(): String {
        backTrack(0, 0)
        return builder.toString()
    }

    private fun backTrack(present: Int, depth : Int) {
        if(depth == m) {
            for(i in arr) {
                builder.append("$i ")
            }
            builder.append("\n")
            return
        }
        for(i in present until n) {
            if(visited[i]) continue
            visited[i] = true
            arr[depth] = i + 1
            backTrack(i + 1, depth + 1)
            visited[i] = false
        }
    }
}
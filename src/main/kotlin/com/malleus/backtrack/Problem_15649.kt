package com.malleus.backtrack

//fun main() {
//    val input = readLine()!!.split(" ").map{it.toInt()}
//    val n = input[0]
//    val m = input[1]
//    val arr = IntArray(m)
//    val visited = BooleanArray(n)
//    solve(arr, visited, n, m, 0)
//}
//
//fun solve(arr : IntArray, visited : BooleanArray, n : Int, m : Int, depth: Int) {
//    if(depth == m) {
//        for(e in arr) {
//            print("$e ")
//        }
//        println()
//        return
//    }
//
//    for(i in 1..n) {
//        if(!visited[i-1]) {
//            visited[i-1] = true
//            arr[depth] = i
//            solve(arr, visited, n, m, depth + 1)
//            visited[i-1] = false
//        }
//    }
//}
fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map{it.toInt()}
    val n = input[0]
    val m = input[1]
    Problem_15649().solve(n, m)
}

class Problem_15649 {
    public fun solve(n : Int, m : Int) {
        Solution(n,m).solve(0)
    }
    private class Solution(private val n: Int, private val m: Int) {
        private val arr : IntArray = IntArray(m)
        private val visited : BooleanArray = BooleanArray(n)

        fun solve(depth: Int) {
            if (depth == m) {
                for (e in arr) {
                    print("$e ")
                }
                println()
                return
            }

            for (i in 1..n) {
                if (!visited[i - 1]) {
                    visited[i - 1] = true
                    arr[depth] = i
                    solve(depth + 1)
                    visited[i - 1] = false
                }
            }
        }
    }
}
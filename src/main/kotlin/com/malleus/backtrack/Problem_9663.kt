package com.malleus.backtrack

import kotlin.math.abs

var n : Int = 0
var answer : Int = 0
lateinit var columns: IntArray

fun main() {
    n = readLine()!!.toInt()
    columns = IntArray(n+1)
    backTrack(1)
    println(answer)
}

fun backTrack(depth : Int) {
    if(depth == n+1) {
        answer++
        return
    }

    for(i in 1..n) { //어느 열에 놓을지 정하는 루프
        var clearRow = 0 //모든 행이 다 똑바로 놨는지 확인하는 변수
        if(depth == 1) { //처음에는 일단 놓음
            columns[depth] = i
            backTrack(depth + 1)
        } else {
            for (j in depth - 1 downTo 1) { //이전 까지 열이 겹치는지 확인 하려는 루프. j는 각 행, columns[j]는 j행의 놓은 퀸의 열 수
                if (!isInVertical(columns[j], i) && !isInDiagonal(j, columns[j], depth, i)) {
                    clearRow++ //조건에 맞으면 맞는 행의 개수를 올림
                }
            }
            if(clearRow == depth - 1) { //이전의 행들에 모두 똑바로 놨으면 깊게 들어간다
                columns[depth] = i
                backTrack(depth + 1)
                columns[depth] = 0
            }
        }
    }
}

fun isInVertical(column1: Int, column2: Int) = column1 == column2
fun isInDiagonal(row1: Int, column1: Int, row2: Int, column2: Int) : Boolean = abs(row1 - row2) == abs(column1 - column2)

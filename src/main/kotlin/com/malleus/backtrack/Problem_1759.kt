package com.malleus.backtrack

var l : Int = 0
var c : Int = 0
lateinit var letters : List<Char>
lateinit var arr : CharArray
lateinit var visited : BooleanArray
val builder = StringBuilder()
var numOfConsonant = 0
var numOfvowel = 0

fun main() {
    val lAndC = readLine()!!.split(" ").map{it.toInt()}
    l = lAndC[0]
    c = lAndC[1]
    letters = readLine()!!.split(" ").map { it.single() }.sorted()
    arr = CharArray(l)
    visited = BooleanArray(c)

    backTrack(0, 0)
    println(builder.toString())
}

fun backTrack(present: Int, depth: Int) {
    if(depth == l) {
        if (isRightNumOfVowel() && isRightNumOfConsonant()) {
            arr.forEach {
                builder.append(it)
            }
            builder.append("\n")
        }
        return
    }
    for(i in present until c) {
        if(visited[i]) continue
        visited[i] = true
        arr[depth] = letters[i]
        cntUpLettersByType(letters[i])
        backTrack(i + 1, depth + 1)
        cntDownLettersByType(letters[i])
        visited[i] = false
    }
}

fun isRightNumOfConsonant() = numOfConsonant >= 2

fun isRightNumOfVowel() = numOfvowel >= 1

fun cntUpLettersByType(letter: Char) {
    when(letter) {
        'a','e','i','o','u' -> numOfvowel++
        else -> numOfConsonant++
    }
}

fun cntDownLettersByType(letter: Char) {
    when(letter) {
        'a','e','i','o','u' -> numOfvowel--
        else -> numOfConsonant--
    }
}
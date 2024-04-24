package io.junhyeon47.baekjoon

import java.util.*

/**
 * A+B
 * https://www.acmicpc.net/problem/1000
 */
fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    println(add(a, b))
}

fun add(a: Int, b: Int): Int {
    return a + b
}
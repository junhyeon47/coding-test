package io.junhyeon47.baekjoon

import java.math.BigInteger
import java.util.*

class Q26529 {
    companion object {
        @JvmStatic
        fun main() = with(Scanner(System.`in`)) {
            val dp = Array(46) { it.toBigInteger() }

            dp[0] = BigInteger.ONE
            dp[1] = BigInteger.ONE

            // 피보나치 수열 계산
            for (i in 2 until dp.size) {
                dp[i] = dp[i - 1] + dp[i - 2]
            }

            val count = nextInt()
            for (i in 0 until count) {
                val month = nextInt()
                println("${dp[month]}")
            }
        }
    }
}
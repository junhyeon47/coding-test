package io.junhyeon47.baekjoon

import java.math.BigInteger
import java.util.*

class Q24416 {
    companion object {
        var recursiveCounter = 0
        var dpCounter = 0

        fun main() = with(Scanner(System.`in`)) {
            val dp = Array(41) { it.toBigInteger() }

            val n = nextInt()

            fib(n)
            fibonacci(dp, n)

            println("${recursiveCounter} ${dpCounter}")
        }

        fun fib(n: Int): BigInteger {
            if (n == 1 || n == 2) {
                recursiveCounter++
                return 1.toBigInteger()
            } else {
                return (fib(n - 1) + fib(n - 2))
            }
        }

        fun fibonacci(dp: Array<BigInteger>, n: Int): BigInteger {
            dp[0] = BigInteger.ZERO
            dp[1] = BigInteger.ONE
            dp[2] = BigInteger.ONE

            for (i in 3 until n + 1) {
                dpCounter++
                dp[i] = dp[i - 1] + dp[i - 2]
            }

            return dp[n]
        }
    }
}
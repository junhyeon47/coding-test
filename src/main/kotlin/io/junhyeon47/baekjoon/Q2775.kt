package io.junhyeon47.baekjoon

import java.util.*

/**
 * 부녀회장이 될테야
 * https://www.acmicpc.net/problem/2775
 */
fun main() = with(Scanner(System.`in`)) {
    // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
    // 1층의 1호에 살려면 0층의 1호부터 1호까지 사는 사람들의 합산
    // 1층의 2호에 살려면 0층의 1호부터 2호까지 사는 사람들의 합산
    // 0층: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
    // 1층: [0, 1, 1+2, 1+2+3, 10, 15, 21, 28, 36, 45, 56, 68, 81, 13, 14]
    // 2층: [0, 1, dp[1] + dp[2], dp[2] + dp[3], ... ]
    // dp[i] = dp[i-1] + dp[i] (i >= 2)
    // 1 ≤ k, n ≤ 14
    // 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라
    // 첫 번째 케이스: k = 1, n = 3, 결과 6 (1층에 3호에는 6명이 산다)
    // 두 번째 케이스: k = 2, n = 3, 결과 10 (2층에 3호에는 10명이 산다)

    val caseNumber = nextInt()
    for (i in 1..caseNumber) {
        val k = nextInt()
        val n = nextInt()
        println(findResidents(k, n))
    }
}


fun findResidents(k: Int, n: Int): Long {
    val dp = LongArray(15) { it.toLong() }  // 0부터 14까지 초기화

    for (floor in 1..k) {  // k층까지 반복
        for (room in 2..<dp.size) {  // 2호부터 14호까지
            dp[room] += dp[room - 1]
        }
    }

    return dp[n]  // n호에 살고 있는 사람 수 반환
}

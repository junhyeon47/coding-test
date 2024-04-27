package io.junhyeon47.baekjoon

import java.math.BigInteger
import java.util.*

/**
 * Virus Outbreak
 * https://www.acmicpc.net/problem/15841
 */
fun main() = with(Scanner(System.`in`)) {
    // 감염된 소의 수는 8시간, 9시간, 10시간 후에 각각 21마리, 34마리, 55마리로 증가했습니다.
    // 입력: 입력은 각각 별도의 줄에 있는 490 이하의 양의 정수로 구성됩니다. 각 수는 시간을 나타냅니다. 입력 과정은 -1이 포함된 줄로 종료됩니다.
    // 출력: 각 입력 값에 대해 출력은 'Hour X: Y cow(s) affected' 형식의 줄을 포함합니다. 여기서 X는 주어진 시간에 해당하는 시간이고, Y는 X 시간에 기준하여 안락사해야 하는 총 감염된 소의 수입니다.
    val dp = Array(491) { it.toBigInteger() }

    dp[1] = BigInteger.ONE
    dp[2] = BigInteger.ONE

    // 피보나치 수열 계산
    for (i in 3 until dp.size) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    
    while (true) {
        val hour = nextInt()

        if (hour == -1) {
            break
        }

        println("Hour $hour: ${dp[hour]} cow(s) affected")
    }
}


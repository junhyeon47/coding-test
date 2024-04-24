package io.junhyeon47.baekjoon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Q2775Test {

    @Test
    fun test_01() {
        // given
        val k = 1
        val n = 3
        val expect = 6L

        // when
        val result = findResidents(k, n)

        // then
        assertThat(result).isEqualTo(expect)
    }

    @Test
    fun test_02() {
        // given
        val k = 2
        val n = 3
        val expect = 10L

        // when
        val result = findResidents(k, n)

        // then
        assertThat(result).isEqualTo(expect)
    }

    @Test
    fun test_03() {
        // given
        val k = 1
        val n = 4
        val expect = 10L

        // when
        val result = findResidents(k, n)

        // then
        assertThat(result).isEqualTo(expect)
    }
}
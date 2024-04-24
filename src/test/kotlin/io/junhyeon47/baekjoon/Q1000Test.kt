package io.junhyeon47.baekjoon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Q1000Test {

    @Test
    fun test_01() {
        // given
        val a = 1
        val b = 2
        val expected = 3

        // when
        val result = add(a,b)

        // then
        assertThat(result).isEqualTo(expected)
    }
}
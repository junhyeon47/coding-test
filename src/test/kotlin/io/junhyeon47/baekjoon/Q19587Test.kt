package io.junhyeon47.baekjoon

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q19587Test {

    @Test
    fun test_01() {
        // given
        val n = 3L
        val expected = 17L

        // when
        val result = calculate(n)

        // then
        Assertions.assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test_02() {
        // given
        val n = 4L
        val expected = 41L

        // when
        val result = calculate(n)

        // then
        Assertions.assertThat(result).isEqualTo(expected)
    }

    @Test
    fun test_03() {
        // given
        val n = 5L
        val expected = 99L

        // when
        val result = calculate(n)

        // then
        Assertions.assertThat(result).isEqualTo(expected)
    }
}
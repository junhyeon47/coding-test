package io.junhyeon47.baekjoon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q24416Test {

    @Test
    fun test_01() {
        // given
        val input = "5"
        val expectedOutput = "5 3\n"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        val outputStream = ByteArrayOutputStream()
        System.setIn(inputStream)
        System.setOut(PrintStream(outputStream))

        // when
        Q24416.main()

        // then
        assertThat(expectedOutput).isEqualTo(outputStream.toString())
    }

    @Test
    fun test_02() {
        // given
        val input = "30"
        val expectedOutput = "832040 28\n"

        val inputStream = ByteArrayInputStream(input.toByteArray())
        val outputStream = ByteArrayOutputStream()
        System.setIn(inputStream)
        System.setOut(PrintStream(outputStream))

        // when
        Q24416.main()

        // then
        assertThat(expectedOutput).isEqualTo(outputStream.toString())
    }
}
package io.junhyeon47.baekjoon

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

/**
 * @author junhyeon.kim@weversecompany.com
 */
class Q26529Test {

    @Test
    fun test() {
        // given
        val input = """
            3
            0
            5
            45
        """.trimIndent()

        val expectedOutput = """
            1
            8
            1836311903
        
        """.trimIndent()

        val inputStream = ByteArrayInputStream(input.toByteArray())
        val outputStream = ByteArrayOutputStream()
        System.setIn(inputStream)
        System.setOut(PrintStream(outputStream))

        // when
        Q26529.main()

        // then
        assertThat(expectedOutput).isEqualTo(outputStream.toString())
    }
}
package _796_rotate_string

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class TestRotateString {
    val tests = listOf(
            listOf("abcde", "cdeab"),
            listOf("abcde", "abced")
    )
    val results = listOf(
            true,
            false
    )

    @Test
    fun testRotateString() {
        val tests = tests
        val data = tests.map { RotateString().rotateString(it[0], it[1]) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

    @Test
    fun testRotateString1() {
        val tests = tests
        val data = tests.map { RotateString().rotateString1(it[0], it[1]) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}

package _242_valid_anagram

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class TestValidAnagram {

    @Test
    fun testValidAnagram() {
        val tests = listOf(
                listOf("", ""),
                listOf("aa", "aa"),
                listOf("aba", "baa"),
                listOf("ranger", "garner"),
                listOf("aabb", "bbba"),
                listOf("anagram", "nagaram"),
                listOf("rat", "cat")
        )
        val results = listOf(
                true,
                true,
                true,
                true,
                false,
                true,
                false
        )

        val data = tests.map { ValidAnagram().isAnagram(it[0], it[1]) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())

    }
}

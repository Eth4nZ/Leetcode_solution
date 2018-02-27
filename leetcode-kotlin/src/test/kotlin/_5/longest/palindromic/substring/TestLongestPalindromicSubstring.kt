package _5.longest.palindromic.substring


import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class TestLongestPalindromicSubstring {

    @Test
    fun testLongestPalindrome() {
        val tests = listOf(
                "",
                "aa",
                "aaa",
                "aaaa",
                "aaaaa",
                "babad",
                "cbbd",
                "baabaad",
                "aaabcbaaa",
                "abbbc",
                "abcda"
        )
        val results = listOf(
                "",
                "aa",
                "aaa",
                "aaaa",
                "aaaaa",
                "aba",
                "bb",
                "aabaa",
                "aaabcbaaa",
                "bbb",
                "a"
        )

        val data = tests.map { LongestPalindromicSubstring().longestPalindrome0(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())

    }
}
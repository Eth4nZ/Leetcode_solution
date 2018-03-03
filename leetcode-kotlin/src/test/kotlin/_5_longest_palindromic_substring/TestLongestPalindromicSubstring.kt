package _5_longest_palindromic_substring


import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test
    val tests = listOf(
            "aaabaaaa",
            "babadada",
            "",
            "cbbd",
            "abcba",
            "aa",
            "aaa",
            "aaaa",
            "aaaaa",
            "babad",
            "baabaad",
            "aaabcbaaa",
            "abbbc",
            "abcda",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
    )
    val results = listOf(
            "aaabaaa",
            "adada",
            "",
            "bb",
            "abcba",
            "aa",
            "aaa",
            "aaaa",
            "aaaaa",
            "aba",
            "aabaa",
            "aaabcbaaa",
            "bbb",
            "a",
            "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
    )

class TestLongestPalindromicSubstring0 {

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { LongestPalindromicSubstring().longestPalindrome0(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}

class TestLongestPalindromicSubstringDP0 {

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { LongestPalindromicSubstring().longestPalindromeDP0(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}

class TestLongestPalindromicSubstringDP1 {

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { LongestPalindromicSubstring().longestPalindromeDP1(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}


class TestLongestPalindromicSubstringDP2 {

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { LongestPalindromicSubstring().longestPalindromeDP2(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}


class TestLongestPalindromicSubstringDP3 {

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { LongestPalindromicSubstring().longestPalindromeDP3(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }
}


class TestSubstring {

    @Test
    fun testSubstring() {
        assertEquals("abcde", LongestPalindromicSubstring().maxLen("abcde", "bcd"))

    }
}


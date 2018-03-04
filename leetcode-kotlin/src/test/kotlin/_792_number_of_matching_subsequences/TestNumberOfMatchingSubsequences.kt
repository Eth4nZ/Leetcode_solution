package _792_number_of_matching_subsequences

import _5_longest_palindromic_substring.tests
import com.sun.xml.internal.fastinfoset.util.StringArray
import org.junit.Assert.assertArrayEquals
import org.junit.Test


class TestNumberOfMatchingSubsequences {
    val tests = listOf(
            listOf("abcde", arrayOf("a", "bb", "acd", "ace"))
            )
    val results = listOf(
            3
            )

        @Test
        fun testLongestPalindrome() {
            val tests = tests
            val data = tests.map { NumberOfMatchingSubsequences().numMatchingSubseq(it[0].toString(), it[1] as Array<String>) }
            assertArrayEquals(results.toTypedArray(), data.toTypedArray())
        }
    }

package _792_number_of_matching_subsequences

import org.junit.Assert.assertArrayEquals
import org.junit.Test


class TestNumberOfMatchingSubsequences {
    val tests = listOf(
            listOf("abcde", arrayOf("bb")),
            listOf("dsahjpjauf", arrayOf("ja", "ahjpjau","ahbwzgqnuk","tnmlanowax")),
            listOf("abc", arrayOf("d")),
            listOf("abcde", arrayOf("a", "bb", "acd", "ace"))
            )
    val results = listOf(
            0,
            2,
            0,
            3
            )

    @Test
    fun testLongestPalindrome() {
        val tests = tests
        val data = tests.map { NumberOfMatchingSubsequences().numMatchingSubseq(it[0].toString(), it[1] as Array<String>) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

    @Test
    fun testLongestPalindromeDict() {
        val tests = tests
        val data = tests.map { NumberOfMatchingSubsequences().numMatchingSubseqDict(it[0].toString(), it[1] as Array<String>) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

    @Test
    fun binarySearchTest(){
        val array = listOf(1, 3, 4 ,6 ,8 , 10)
        for (i in 0..10)
            print(array.binarySearch(i).toString() + " ")
        println()
        val array0 = listOf(1, 3, 4 ,6 ,8 , 10)
            println(array0.binarySearch(0))
        val array1 = listOf(1, 3, 4 ,6 ,8 , 10)
        println(array1.binarySearch(1))
        val array2 = listOf(1, 3, 4 ,6 ,8 , 10)
        println(array2.binarySearch(2))
        val array3 = listOf(1, 3, 4 ,6 ,8 , 10)
        println(array3.binarySearch(5))
    }

}

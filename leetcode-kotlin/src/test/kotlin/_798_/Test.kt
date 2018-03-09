package _798_

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class Test {
    val tests = listOf(
            listOf("abcde", arrayOf("bb")),
            listOf("dsahjpjauf", arrayOf("ja", "ahjpjau", "ahbwzgqnuk", "tnmlanowax")),
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
    fun test() {
        val tests = tests
        val data = tests.map { }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

package _809_expressive_words

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 01/04/18.
 */

class Test809ExpressiveWords {
    val tests = listOf(
            listOf(
                    "heeellooo",
                    arrayOf("hello", "hi", "helo")
            ),
            listOf(
                    "dddiiiinnssssssoooo",
                    arrayOf("dinnssoo","ddinso","ddiinnso","ddiinnssoo","ddiinso","dinsoo","ddiinsso","dinssoo","dinso")
            ),
            listOf(
                    "aaa",
                    arrayOf("aaaa")
            )
    )
    val results = listOf(
            1,
            3,
            0
    )

    @Test
    fun test809ExpressiveWords() {
        val tests = tests
        val data = tests.map { ExpressiveWords().expressiveWords(it[0] as String, it[1] as Array<String>) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

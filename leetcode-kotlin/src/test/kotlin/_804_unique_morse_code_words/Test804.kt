package _804_unique_morse_code_words

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class Test804 {
    val tests = listOf(
            arrayOf("gin", "zen", "gig", "msg")
    )
    val results = listOf(
            2
    )

    @Test
    fun test804() {
        val tests = tests
        val data = tests.map { UniqueMorseCodeWords().uniqueMorseRepresentations(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

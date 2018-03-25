package _805_split_array_with_same_average

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class Test805 {
    val tests = listOf(
            intArrayOf(1,2,3,4,5,6,7,8)
    )
    val results = listOf(
            true
    )

    @Test
    fun test805() {
        val tests = tests
        val data = tests.map { SplitArrayWithSameAverage().splitArraySameAverage(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

package _53_maximum_subarray

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 27/03/18.
 */

class Test53MaximumSubarray {
    val tests = listOf(
            intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
    )
    val results = listOf(
            6
    )

    @Test
    fun test53MaximumSubarray() {
        val tests = tests
        val data = tests.map { MaximumSubarray().maxSubArray(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

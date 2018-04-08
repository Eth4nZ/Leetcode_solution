package _812_largest_triangle_area

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 08/04/18.
 */

class Test812LargestTriangleArea {
    val tests = listOf(
            arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, 2), intArrayOf(2, 0))
    )
    val results = listOf(
            2
    )

    @Test
    fun test812LargestTriangleArea() {
        val tests = tests
        val data = tests.map { LargestTriangleArea().largestTriangleArea(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

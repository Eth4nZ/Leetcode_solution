package _70_climbing_stairs

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 29/03/18.
 */

class Test70ClimbingStairs {
    val tests = listOf(
            2,
            3,
            4,
            5
    )
    val results = listOf(
            2,
            3,
            5,
            8
    )

    @Test
    fun test70ClimbingStairs() {
        val tests = tests
        val data = tests.map { ClimbingStairs().climbStairs(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

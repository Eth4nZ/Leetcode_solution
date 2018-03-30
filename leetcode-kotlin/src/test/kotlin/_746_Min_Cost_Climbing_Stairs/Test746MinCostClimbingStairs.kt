package _746_min_cost_climbing_stairs

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 31/03/18.
 */

class Test746MinCostClimbingStairs {
    val tests = listOf(
            intArrayOf(10, 15, 20),
            intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
    )
    val results = listOf(
            15,
            6
    )

    @Test
    fun test746MinCostClimbingStairs() {
        val tests = tests
        val data = tests.map { MinCostClimbingStairs().minCostClimbingStairs(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

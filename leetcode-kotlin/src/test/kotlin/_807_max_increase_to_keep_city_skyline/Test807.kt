package _807_max_increase_to_keep_city_skyline

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class Test807 {
    val tests = listOf(
            arrayOf(intArrayOf(3,0,8,4), intArrayOf(2,4,5,7), intArrayOf(9,2,6,3), intArrayOf(0,3,1,0))
    )
    val results = listOf(
            35
    )

    @Test
    fun test807() {
        val tests = tests
        val data = tests.map { MaxIncreasetoKeepCitySkyline().maxIncreaseKeepingSkyline(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

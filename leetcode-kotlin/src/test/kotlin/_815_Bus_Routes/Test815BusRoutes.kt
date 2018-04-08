package _815_bus_routes

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 08/04/18.
 */

class Test815BusRoutes {
    val tests = listOf(
            arrayOf(arrayOf(intArrayOf(1, 2, 7), intArrayOf(3, 6, 7)), 1, 6)
    )
    val results = listOf(
            2
    )

    @Test
    fun test815BusRoutes() {
        val tests = tests
//        val data = tests.map { BusRoutes().numBusesToDestination(it[0] as Array<IntArray>, it[1] as Int, it[2] as Int) }
//        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

package _806_number_of_lines_to_write_string

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class Test806 {
    val tests = listOf(
            listOf(
                    intArrayOf(10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10),
                    "abcdefghijklmnopqrstuvwxyz"
            )
    )
    val results = listOf(
            listOf(3, 60)
    )

    @Test
    fun test806() {
        val tests = tests
        val data = tests.map { NumberofLinesToWriteString().numberOfLines(it[0] as IntArray, it[1] as String)
            println(it[0])
            println(it[1])
        }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

package _800_similar_rgb_color

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class TestSimilarRGBColor {
    val tests = listOf(
            "#09f166"
    )
    val results = listOf(
            "#11ee66"
    )

    @Test
    fun testSimilarRGBColor() {
        val tests = tests
        val data = tests.map { SimilarRGBColor().similarRGB(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

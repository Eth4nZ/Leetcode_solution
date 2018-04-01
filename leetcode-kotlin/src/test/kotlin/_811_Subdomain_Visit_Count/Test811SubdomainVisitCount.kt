package _811_subdomain_visit_count

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 01/04/18.
 */

class Test811SubdomainVisitCount {
    val tests = listOf(
            arrayOf("9001 discuss.leetcode.com")
    )
    val results = listOf(
            listOf("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com")
    )

    @Test
    fun test811SubdomainVisitCount() {
        val tests = tests
        val data = tests.map { SubdomainVisitCount().subdomainVisits(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

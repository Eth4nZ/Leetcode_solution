package _794_valid_tic_tac_toe_state

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * Created by eth4 on 9/3/18.
 */

class TestValidTicTacToeState {
    val tests = listOf(
            arrayOf("O  ", "   ", "   "),
            arrayOf("XOX", " X ", "   "),
            arrayOf("XXX", "   ", "OOO"),
            arrayOf("XOX", "O O", "XOX"),
            arrayOf("XXX","OOX","OOX"),
            arrayOf("XO ","XO ","XO "),
            arrayOf("XXX","XOO","OO "),
            arrayOf("OXX",
                    "XOX",
                    "OXO"),
            arrayOf("XXO",
                    "XOX",
                    "OXO")

    )
    val results = listOf(
            false,
            false,
            false,
            true,
            true,
            false,
            false,
            false,
            false
    )

    @Test
    fun test() {
        val tests = tests
        val data = tests.map { ValidTicTacToeState().validTicTacToe(it) }
        assertArrayEquals(results.toTypedArray(), data.toTypedArray())
    }

}

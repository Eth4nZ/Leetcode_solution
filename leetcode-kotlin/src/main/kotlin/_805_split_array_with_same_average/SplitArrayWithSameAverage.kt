package _805_split_array_with_same_average;

/**
 * Created by eth4 on 25/3/18.
 */
class SplitArrayWithSameAverage {
    fun splitArraySameAverage(A: IntArray): Boolean {
        val half = A.sum() / 2
        val dp = Array(10000, { 0 })

        for (i in 1..A.size) {
            for (j in half..A[i]) {

            }

        }
        return true
    }

}


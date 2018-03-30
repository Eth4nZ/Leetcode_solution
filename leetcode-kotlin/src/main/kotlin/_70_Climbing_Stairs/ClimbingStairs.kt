package _70_climbing_stairs

/**
 * Created by eth4 on 29/03/18.
 */

class ClimbingStairs {
    /*
    F(n) = F(n - 2) + F(n - 1)
     */
    fun climbStairs(n: Int): Int {
        if (n <= 2)
            return n
        var a = 1
        var b = 2
        for (i in 3..n) {
            b += a
            a = b - a
        }
        return b
    }
}

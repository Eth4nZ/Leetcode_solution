package _746_min_cost_climbing_stairs

/**
 * Created by eth4 on 31/03/18.
 */

class MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        for (i in 2..cost.lastIndex) {
            cost[i] += if (cost[i - 2] < cost[i - 1])
                cost[i - 2]
            else
                cost[i - 1]
        }
        return if (cost.last() < cost[cost.lastIndex - 1])
            cost.last()
        else
            cost[cost.lastIndex - 1]
    }

}

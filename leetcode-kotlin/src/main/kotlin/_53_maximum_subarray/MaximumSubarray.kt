package _53_maximum_subarray

import kotlin.math.max

/**
 * Created by eth4 on 27/03/18.
 */

class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        dp[0] = nums[0]

        var ret = dp[0]
        for (i in 1..nums.lastIndex) {
            dp[i] = nums[i] +
                    if (dp[i - 1] > 0)
                        dp[i - 1]
                    else
                        0
            ret = max(ret, dp[i])
        }

        return ret
    }

    fun max(a: Int, b: Int): Int {
        return if(a > b)
            a
        else
            b
    }
}

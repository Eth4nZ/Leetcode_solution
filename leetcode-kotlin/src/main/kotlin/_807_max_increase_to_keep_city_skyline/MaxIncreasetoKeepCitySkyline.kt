package _807_max_increase_to_keep_city_skyline;

/**
 * Created by eth4 on 25/3/18.
 */
class MaxIncreasetoKeepCitySkyline {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var originSum = 0
        val row = IntArray(grid.size, { 0 })
        val col = IntArray(grid.size, { 0 })
        for ((i, g) in grid.withIndex()) {
            for ((j, h) in g.withIndex()) {
                originSum += grid[i][j]
                if (grid[i][j] > row[i])
                    row[i] = grid[i][j]
                if (grid[i][j] > col[j])
                    col[j] = grid[i][j]
            }
        }

        var ret = 0

        for (i in row) {
            for (j in col) {
                ret += minOf(i, j)
            }
        }

        return ret-originSum
    }
}

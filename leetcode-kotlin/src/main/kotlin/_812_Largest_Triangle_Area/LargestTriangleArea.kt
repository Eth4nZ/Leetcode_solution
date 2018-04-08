package _812_largest_triangle_area

/**
 * Created by eth4 on 08/04/18.
 */

class LargestTriangleArea {
    fun largestTriangleArea(points: Array<IntArray>): Double {
        var ret = 0.0
        for (pointA in points) {
            for (pointB in points) {
                if (!pointB.contentEquals(pointA))
                    for (pointC in points) {
                        if (!pointC.contentEquals(pointB) && !pointC.contentEquals(pointA)) {
                            val area = getArea(pointA, pointB, pointC)
                            if (area > ret)
                                ret = area
                        }
                }
            }
        }
        return ret
    }

    fun getArea(a: IntArray, b: IntArray, c: IntArray): Double {
        var area = 0.0
        area += (a[1] + c[1]) * (a[0] - c[0])
        area += (b[1] + a[1]) * (b[0] - a[0])
        area += (c[1] + b[1]) * (c[0] - b[0])

        return area / 2
    }
}

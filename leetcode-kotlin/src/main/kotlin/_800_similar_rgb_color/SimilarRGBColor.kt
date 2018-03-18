package _800_similar_rgb_color

import kotlin.math.abs

/**
 * Created by eth4 on 18/3/18.
 */

class SimilarRGBColor {
    val array = ArrayList<Int>()

    fun similarRGB(color: String): String {
        for (i in 0..15) {
            array.add(i * 16 + i)
        }
        println(array)
        val a = color.substring(1, 3).toLong(radix = 16).toInt()
        val b = color.substring(3, 5).toLong(radix = 16).toInt()
        val c = color.substring(5, 7).toLong(radix = 16).toInt()


        return "#" + find(a) + find(b) + find(c)
    }

    fun find(a: Int): String {
        var n = array.binarySearch(a)
        println(n)
        if (n < 0) {
            n = -n - 1
            var lhs = n - 1
            n = shift(n)
            lhs = shift(lhs)
            n = if (abs(array[lhs] - a) > abs(array[n] - a))
                n
            else
                lhs
        }

        var hex = array[n].toString(radix = 16)
        if (hex == "0")
            hex = "00"

        return hex
    }

    fun shift(n: Int): Int {
        if (n > 15)
            return n - 16
        if (n < 0)
            return n + 16
        return n
    }

    fun abs(a: Int): Int {
        if (a < 0)
            return -a
        return a
    }
}

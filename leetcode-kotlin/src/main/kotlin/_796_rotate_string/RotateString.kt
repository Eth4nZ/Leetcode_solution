package _796_rotate_string

/**
 * Created by eth4 on 11/3/18.
 */

class RotateString {
    fun rotateString(A: String, B: String): Boolean {
        for (i in 1..B.length) {
            if ((B.substring(i, B.length) + B.substring(0, i)) == A) {
                return true
            }
        }
        return false
    }

    fun rotateString1(A: String, B: String): Boolean {
        return A.length == B.length && (A + A).indexOf(B) > -1
    }
}
package _5_longest_palindromic_substring

import jdk.nashorn.internal.objects.NativeString.substr





class LongestPalindromicSubstring {

    fun longestPalindrome0(s: String): String {
        if (s.length < 2)
            return s
        var curLongestPalindrome = ""
        var pc = 1
        var lhs: Int
        var rhs: Int
        while (pc < s.length * 2 - 2) {
            if (pc % 2 == 0) {
                lhs = pc / 2 - 1
                rhs = pc / 2 + 1
            } else {
                lhs = pc / 2
                rhs = pc / 2+1
            }
            while (lhs >= 0 && rhs <= s.lastIndex && s[lhs] == s[rhs]) {
                lhs--
                rhs++
            }
            val temp = s.substring(lhs + 1, rhs)
            if (temp.length > curLongestPalindrome.length) {
                curLongestPalindrome = temp
            }
            pc++
        }

        return curLongestPalindrome
    }

    var longestString = ""

    fun longestPalindromeDP0(s: String): String {
        if (s.length <= 1)
            return s
        longestLen(s, 0, s.length-1)
        return if (longestString == "")
            s[0].toString()
        else
            longestString
    }

    fun longestLen(s: String, lhs: Int, rhs: Int): Int {
        if (s[lhs] == s[rhs]){
            if (rhs - lhs <= 2) {
                if (s.substring(lhs, rhs+1).length > longestString.length) {
                    longestString = s.substring(lhs, rhs+1)
                }
                return rhs - lhs +1
            } else
                return longestLen(s, lhs + 1, rhs - 1) + 2
        }
        else {
            if (rhs - lhs <= 1)
                return 0
            else {
                return maxOf(longestLen(s, lhs + 1, rhs), longestLen(s, lhs, rhs - 1))
            }
        }

    }

    fun longestPalindromeDP1(s: String): String {
        if (s.length <= 1)
            return s
        val str = longestLen1(s)
        return if (str == "")
            s[0].toString()
        else
            str

    }

    private fun longestLen1(s: String): String {
        if (s.first() == s.last()){
            if (s.length <= 3) {
                return s
            } else {
                val subString = longestLen1(s.substring(1, s.lastIndex))
                return if (subString == "")
                    ""
                else
                    s.first() + subString + s.last()
            }
        }
        else {
            return if (s.length <= 2)
                ""
            else {
                maxLen(longestLen1(s.substring(0, s.lastIndex)), longestLen1(s.substring(1, s.length)))
            }
        }

    }

    fun maxLen(s0: String, s1: String): String {
        return if (s0.length > s1.length)
            s0
        else
            s1
    }


    fun longestPalindromeDP2(s: String): String {
        var ret = ""
        val dp = Array(s.length, { BooleanArray(s.length) })
        for (i in s.lastIndex downTo 0) {
            for (j in i..s.lastIndex) {
                dp[i][j] = s[i] == s[j] && (j - i <= 2 || dp[i + 1][j - 1])
                if (dp[i][j] && j - i + 1 > ret.length)
                    ret = s.substring(i, j + 1)

            }
        }

        return ret
    }


    fun longestPalindromeDP3(s: String): String {
        var ret = ""
        val dp = Array(s.length, { BooleanArray(s.length) })
        for (i in 0..s.lastIndex) {
            for (j in i downTo 0) {
                dp[i][j] = s[i] == s[j] && (i - j <= 2 || dp[i - 1][j + 1])
                if (dp[i][j] && i - j + 1 > ret.length)
                    ret = s.substring(j, i + 1)

            }
        }

        return ret
    }

    private fun expandAroundCenter(s: String, c1: Int, c2: Int): String {
        var l = c1
        var r = c2
        while (l >= 0 && r <= s.lastIndex && s[l] == s[r]) {
            l--
            r++
        }
        return s.substring(l + 1, r)
    }

    fun longestPalindromeExpand1(s: String): String {
        if (s.isEmpty()) return ""

        var longest = s.substring(0, 1)  // a single char itself is a palindrome
        for (i in 0..s.lastIndex) {
            val p1 = expandAroundCenter(s, i, i)
            if (p1.length > longest.length)
                longest = p1

            val p2 = expandAroundCenter(s, i, i + 1)
            if (p2.length > longest.length)
                longest = p2
        }
        return longest
    }



}
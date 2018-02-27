package _5.longest.palindromic.substring



class LongestPalindromicSubstring {
    fun longestPalindrome0(s: String): String {
        if (s.length < 2)
            return s
        var curLongestPalindrome = ""
        var pc = s.length - 1
        var lhs: Int
        var rhs: Int
        while (pc >= 1) {
            var temp = ""
            if (pc%2 == 0) {
                    temp = s[pc/2].toString()
                    lhs = pc/2 - 1
                    rhs = pc/2 + 1
                } else {
                    lhs = pc/2
                    rhs = pc/2+1
                }
                while ( lhs >= 0) {
                    if (s[lhs] == s[rhs]) {
                        temp = s[lhs] + temp + s[rhs]
                        lhs--
                        rhs++
                    } else {
                        break
                    }
                    if (temp.length > curLongestPalindrome.length) {
                        curLongestPalindrome = temp
                    }

                }
                pc--
            }

        pc = s.length - 1
        while (pc < (s.length - 1) * 2) {
            var temp = ""
            if (pc%2 == 0) {
                lhs = pc/2 - 1
                rhs = pc/2 + 1
                temp = s[pc/2].toString()
            } else {
                lhs = pc/2
                rhs = pc/2+1
            }
            while (rhs < s.length) {
                if (s[lhs] == s[rhs]) {
                    temp = s[lhs] + temp + s[rhs]
                    lhs--
                    rhs++
                } else {
                    break
                }
                if (temp.length > curLongestPalindrome.length) {
                    curLongestPalindrome = temp
                }

            }
            pc++
        }

        if (curLongestPalindrome.length < 2) {
            return s[0].toString()
        }

        return curLongestPalindrome
    }

}
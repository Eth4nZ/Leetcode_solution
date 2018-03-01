package _242_valid_anagram

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length)
            return false

        val size = 200

        val buf = IntArray(size, { _ -> 0 })

        for (c in s)
            buf[c.toInt()]++
        for (c in t)
            buf[c.toInt()]--

        for (i in buf)
            if (i != 0)
                return false

        return true
    }
}
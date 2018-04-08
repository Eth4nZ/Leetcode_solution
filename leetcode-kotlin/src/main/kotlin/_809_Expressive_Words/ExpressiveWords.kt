package _809_expressive_words

/**
 * Created by eth4 on 01/04/18.
 */
class ExpressiveWords {
    fun expressiveWords(S: String, words: Array<String>): Int {
        val origin = arrayListOf<Int>()
        var count = 0
        var cur: Char? = null
        var index = -1
        for (c in S) {
            if (cur != c) {
                origin.add(1)
                index++
                cur = c
            } else
                origin[index]++
        }


        for (word in words) {
            val curDic = arrayListOf<Int>()
            cur = null
            index = -1
            for (c in word) {
                if (cur != c) {
                    curDic.add(1)
                    index++
                    cur = c
                } else
                    curDic[index]++
            }

            var flag = true

            if (curDic.size == origin.size) {
                for (i in 0..origin.lastIndex) {
                    if (origin[i] != curDic[i] && origin[i] - curDic[i] < 2 && origin[i] < 3 || origin[i] < curDic[i]) {
                        flag = false
                        break
                    }
                }
                if (flag)
                    count++
            }
        }

        return count

    }

}

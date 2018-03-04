package _792_number_of_matching_subsequences


class NumberOfMatchingSubsequences {

    fun numMatchingSubseq(S: String, words: Array<String>): Int {
        val array = Array(words.size, { words[it].length })
        var count = words.size
        for (j in S.lastIndex downTo 0) {
            for (i in words.indices){
                if (array[i] != 0)
                    if (S[j] == words[i][array[i] - 1]) {
                        array[i]--
                        if (array[i] == 0) {
                            count--
                            if (count == 0)
                                return words.size
                        }
                    }
            }
        }

        return array.indices.count { array[it] == 0 }

    }
}
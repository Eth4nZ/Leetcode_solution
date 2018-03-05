package _792_number_of_matching_subsequences

import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue


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

//    fun isMatch(dictionary: Array<ArrayList<Int>>, word: String): Boolean{
//
//    }


    fun numMatchingSubseqDict(S: String, words: Array<String>): Int {

        val dictionary = Array(26, { ArrayList<Int>(0)  })
        for ((i, c) in S.withIndex()) {
            dictionary[c-'a'].add(i)
        }
        val f = dictionary['g'-'a'].lastIndex
        var count = 0
        for (word in words) {
            var i = 0
            for (c in word) {
                var position = dictionary[c - 'a'].binarySearch(i)
                if (position >= 0) {
                    i = dictionary[c - 'a'][position] + 1
                } else
                    position = -position - 1
                    if (position > dictionary[c - 'a'].lastIndex) {
                        i = -1
                        break
                    }
                    else
                        i = dictionary[c - 'a'][position] + 1
            }
            if (i > word.lastIndex){
                count++
            }
        }

        return count
    }

}
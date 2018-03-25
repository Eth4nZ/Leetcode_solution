package _804_unique_morse_code_words;

/**
 * Created by eth4 on 25/3/18.
 */
class UniqueMorseCodeWords {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val dic = listOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        var ret:MutableList<String> = mutableListOf()

        for (word in words) {
            var tempMorse = ""
            for (c in word) {
                tempMorse += dic[c - 'a']
            }
           if (ret.indexOf(tempMorse) < 0)
               ret.add(tempMorse)
        }

        return ret.size
    }
}

package _806_number_of_lines_to_write_string;

/**
 * Created by eth4 on 25/3/18.
 */
class NumberofLinesToWriteString {
    fun numberOfLines(widths: IntArray, S: String): IntArray {
        if (S.length == 0)
            return intArrayOf(0, 0)
        var lineCount = 1
        var tempCount = 0
        for (c in S) {
            if (tempCount + widths[c-'a'] <= 100)
                tempCount += widths[c-'a']
            else {
                lineCount++
                tempCount = widths[c-'a']
            }
        }
        return intArrayOf(lineCount, tempCount)
    }
}

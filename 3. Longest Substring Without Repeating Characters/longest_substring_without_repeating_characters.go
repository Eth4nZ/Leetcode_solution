package ___Longest_Substring_Without_Repeating_Characters


func lengthOfLongestSubstring(s string) int {

	hashMap := map[byte]int{}

	i := 0
	j := 0
	ret := 0

	for i < len(s) && j < len(s) {

		if _, ok := hashMap[s[j]]; !ok {
			hashMap[s[j]] = j
			if j-i+1 > ret {
				ret = j-i+1
			}
			j++
		} else{
			delete(hashMap, s[i])
			i++
		}
	}

	return ret
}
package ___Longest_Substring_Without_Repeating_Characters


func lengthOfLongestSubstring(s string) int {
	if len(s) == 0{
		return 0
	}

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

func lengthOfLongestSubstring2(s string) int {
	if len(s) == 0{
		return 0
	}

	hashMap := map[byte]int{}
	i := 0
	ret := 0

	for j := 0; j < len(s); j++ {
		if _, ok := hashMap[s[j]]; ok {
			if hashMap[s[j]]+1 > i {
				i = hashMap[s[j]]+1
			}
		}
		if j-i+1 > ret {
			ret = j-i+1
		}
		hashMap[s[j]] = j
	}

	return ret
}
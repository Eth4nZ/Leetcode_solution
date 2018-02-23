package ___Longest_Palindromic_Substring


func longestPalindrome(s string) string {
	if len(s) < 2 {
		return s
	}
	curLongestPalindrome := ""
	pc := len(s)-1
	var lhs int
	var rhs int
	for pc >= 1 {
		temp := ""
		if pc%2 == 0 {
			temp = string(s[pc/2])
			lhs = pc/2 - 1
			rhs = pc/2 + 1
		} else {
			lhs = pc/2
			rhs = pc/2+1
		}
		for lhs >= 0 {
			if s[lhs] == s[rhs] {
				temp = string(s[lhs]) + temp + string(s[rhs])
				lhs--
				rhs++
			} else {
				break
			}
			if len(temp) > len(curLongestPalindrome) {
				curLongestPalindrome = temp
			}

		}
		pc--
	}

	pc = len(s)-1
	for pc < (len(s)-1)*2 {
		temp := ""
		if pc%2 == 0 {
			lhs = pc/2 - 1
			rhs = pc/2 + 1
			temp = string(s[pc/2])
		} else {
			lhs = pc/2
			rhs = pc/2+1
		}
		for rhs < len(s) {
				if s[lhs] == s[rhs] {
				temp = string(s[lhs]) + temp + string(s[rhs])
				lhs--
				rhs++
			} else {
				break
			}
			if len(temp) > len(curLongestPalindrome) {
				curLongestPalindrome = temp
			}

		}
		pc++
	}

	return curLongestPalindrome
}


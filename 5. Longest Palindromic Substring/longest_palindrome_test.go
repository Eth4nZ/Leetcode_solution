package ___Longest_Palindromic_Substring

import (
	"testing"
)

func TestLongestPalindrome(test *testing.T) {
	tests := []string{
		"a",
		"aa",
		"aaa",
		"aaaa",
		"aaaaa",
		"babad",
		"cbbd",
		"baabaad",
		"aaabcbaaa",
		"abcda",
	}
	results := []string{
		"",
		"aa",
		"aaa",
		"aaaa",
		"aaaaa",
		"aba",
		"bb",
		"aabaa",
		"aaabcbaaa",
		"a",
	}

	for t := 0; t < len(tests); t++ {
		if ret := longestPalindrome(tests[t]); ret != results[t] {
			test.Errorf("case %d failed. found: %v, expect: %v \n", t, ret, results[t])
		} else {
			test.Logf("\tcase %d passed, result matches: %v \n", t, results[t])
		}
	}

}

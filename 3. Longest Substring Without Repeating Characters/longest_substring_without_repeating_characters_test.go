package ___Longest_Substring_Without_Repeating_Characters

import "testing"

func TestLengthOfLongestSubstring(test *testing.T) {
	tests := []string{
		"abcabcbb",
		"bbbbb",
		"pwwkew",
	}
	results := []int{
		3,
		1,
		3,
	}

	for t := 0; t < len(tests); t++ {
		if ret := lengthOfLongestSubstring(tests[t]); ret != results[t] {
			test.Fatalf("case %d failed. found: %v, expect: %v \n", t, ret, results[t])
		}
	}
}

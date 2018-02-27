package ___Longest_Substring_Without_Repeating_Characters

import "testing"

func TestLengthOfLongestSubstring(test *testing.T) {
	tests := []string{
		"abcabcbb",
		"bbbbb",
		"pwwkew",
		"abacde",
		"jabjcdel",
	}
	results := []int{
		3,
		1,
		3,
		5,
		7,
	}

	for t := 0; t < len(tests); t++ {
		if ret := lengthOfLongestSubstring(tests[t]); ret != results[t] {
			test.Fatalf("case %d failed. found: %v, expect: %v \n", t, ret, results[t])
		}
	}
}

func TestLengthOfLongestSubstring2(test *testing.T) {
	tests := []string{
		"abcabcbb",
		"bbbbb",
		"pwwkew",
		"abacde",
		"jabjcdel",
	}
	results := []int{
		3,
		1,
		3,
		5,
		7,
	}

	for t := 0; t < len(tests); t++ {
		if ret := lengthOfLongestSubstring2(tests[t]); ret != results[t] {
			test.Fatalf("case %d failed. found: %v, expect: %v \n", t, ret, results[t])
		}
	}
}

package ___Median_of_Two_Sorted_Arrays

import "testing"

func TestFindMedianSortedArrays(test *testing.T) {
	tests := [][][]int{
		{
			[]int{1, 3},
			[]int{2},
		},
		{
			[]int{1, 2, 3},
			[]int{4, 5, 6},
		},
		{
			[]int{},
			[]int{1},
		},
		{
			[]int{2},
			[]int{},
		},
		{
			[]int{},
			[]int{1, 2, 3},
		},
		{
			[]int{1, 2, 3},
			[]int{},
		},
		{
			[]int{1, 3, 4},
			[]int{2, 5, 6},
		},
	}
	results := []float64{
		2,
		3.5,
		1,
		2,
		2,
		2,
		3.5,
	}

	for t := 0; t < len(tests); t++ {
		if ret := findMedianSortedArrays(tests[t][0], tests[t][1]); ret != results[t] {
			test.Fatalf("case %d failed. found: %v, expect: %v \n", t, ret, results[t])
		}
		println("--", t, "--")
	}
}

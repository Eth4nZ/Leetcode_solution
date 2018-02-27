package range_sum_query

import (
	"testing"
)

func Test303(t *testing.T) {
	tests := []int{-2, 0, 3, -5, 2, -1}
	ij := [][]int{
		{0, 2},
		{2, 5},
		{0, 5},
	}
	results := []int{
		1,
		-1,
		-3,
	}
	caseNum := 3
	obj := Constructor(tests)
	for i := 0; i < caseNum; i++ {
		if ret := obj.SumRange(ij[i][0], ij[i][1]); ret != results[i] {
			t.Fatalf("case %d failed. found: %v, expected: %v\n", i, ret, results[i])
		}
	}
}

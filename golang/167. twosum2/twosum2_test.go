package two_sum2

import (
"testing"
)

func TestTwoSum2(t *testing.T) {
	tests := [][]int{
		[]int{3, 24, 50, 79, 88, 150, 345},
		[]int{0, 1, 4, 8, 11, 14, 22},
		[]int{0, 1, 4},
	}
	targets := []int{
		200,
		23,
		4,
	}
	results := [][]int{
		[]int{3, 6},
		[]int{2, 7},
		[]int{1, 3},
	}
	caseNum := 3
	for i := 0; i < caseNum; i++ {
		if ret := twoSum(tests[i], targets[i]); ret[0] != results[i][0] && ret[1] != results[i][1] {
			t.Fatalf("case %d fails: %v\n", i, ret)
		}
	}
}

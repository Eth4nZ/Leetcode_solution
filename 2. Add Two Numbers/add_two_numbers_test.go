package ___Add_Two_Numbers

import (
	"testing"
)

func TestAddTwoNumbersTest(test *testing.T) {

	tests := [][][]int{
		{
			[]int{2, 4, 3},
			[]int{5, 6, 4},
		},
		{
			[]int{1, 8},
			[]int{0},
		},
	}

	results := [][]int{
		{7, 0, 8},
		{1, 8},
	}

	caseNum := 2
	for t := 0; t < caseNum; t++ {
		lhs := &ListNode{tests[t][0][0], nil}
		rhs := &ListNode{tests[t][1][0], nil}
		p := lhs
		for i := 0; i < 2; i++{
			switch i {
			case 0:
				p = lhs
			case 1:
				p = rhs
			}
			for j := 1; j < len(tests[t][i]); j++ {
				p.Next = &ListNode{tests[t][i][j], nil}
				p = p.Next
			}
		}
		ret := addTwoNumbers(lhs, rhs)
		ans := []int{}
		i := 0
		ans = append(ans, ret.Val)
		for ret.Next != nil {
			i++
			ret = ret.Next
			ans = append(ans, ret.Val)
		}
		if !IntArrayEquals(ans, results[t]) {
			test.Fatalf("case 0 fails: %v\n", ans)
		}
	}
}

func IntArrayEquals(a []int, b []int) bool {
	if len(a) != len(b) {
		return false
	}
	for i, v := range a {
		if v != b[i] {
			return false
		}
	}
	return true
}


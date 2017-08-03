package main

import (
	"fmt"
)

func main() {

	//test := []int{2, 7, 11, 15}
	//fmt.Println(twoSum(test, 9))

	test1 := []int{3,24,50,79,88,150,345}
	test1_target := 200
	fmt.Println(twoSum(test1, test1_target))
}

func twoSum(nums []int, target int) []int {

	result := make([]int, 2)

	result[0] = 0
	result[1] = len(nums)-1
	for result[0] < len(nums) - 1 && result[1] > 0 {
		sum := nums[result[0]] + nums[result[1]]
		if sum == target{
			result[0]++
			result[1]++
			return result
		}
		if sum < target{
			result[0]++
		} else {
			result[1]--
		}
	}
	return nil
}

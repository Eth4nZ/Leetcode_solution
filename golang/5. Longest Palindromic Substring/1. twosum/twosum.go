package two_sum

import (
	"fmt"
	"sort"
)

func main() {
	test := []int{2, 7, 11, 15}
	fmt.Println(twoSum(test, 9))

}

func twoSum(nums []int, target int) []int {

	result := make([]int, 2)
	hashMap := map[int]int{}

	for i := range nums {
		if index, ok := hashMap[nums[i]]; ok {
			if i == index { continue }
			result[0] = i
			result[1] = index
			sort.Ints(result)
			return result
		}
		hashMap[target-nums[i]] = i
	}

	return nil
}
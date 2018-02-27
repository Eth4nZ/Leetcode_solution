package range_sum_query


type NumArray struct {
	numArray []int
}


func Constructor(nums []int) NumArray {
	for i := 1; i < len(nums); i++ {
		nums[i] += nums[i-1]
	}
	return NumArray{nums}
}


func (this *NumArray) SumRange(i int, j int) int {
	if i == 0 {
		return this.numArray[j]
	} else{
		return this.numArray[j] - this.numArray[i-1]
	}
}


/**
 * Your NumArray object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.SumRange(i,j);
 */
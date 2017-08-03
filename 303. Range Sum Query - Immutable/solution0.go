package main

func main(){
	nums := []int{-2, 0, 3, -5, 2, -1}
	obj := Constructor(nums)
	println("expect 1, found: ", obj.SumRange(0, 2))
	println("expect -1, found: ", obj.SumRange(2, 5))
	println("expect -3, found: ", obj.SumRange(0, 5))

}

type NumArray struct {
	numArray []int
}


func Constructor(nums []int) NumArray {
	for i := range nums {
		if i > 0 {
			nums[i] += nums[i-1]
		}
	}
	return NumArray{nums}
}


func (this *NumArray) SumRange(i int, j int) int {
	if i == 0{
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
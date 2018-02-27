package ___Median_of_Two_Sorted_Arrays

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	medianPosition := (len(nums1) + len(nums2))/2 +1
	isOddLen := true
	if (len(nums1) + len(nums2))%2 == 0 {
		isOddLen = false
		medianPosition--
	}
	i := -1
	j := -1
	a := 0
	b := 0

	for i+j+2 <= medianPosition && (hasNext(i, nums1) || hasNext(j, nums2)) {
		b = a
		if hasNext(i, nums1) && hasNext(j, nums2){
			if nums1[i+1] < nums2[j+1]{
				i++
				a = nums1[i]
			} else{
				j++
				a = nums2[j]
			}
		} else if hasNext(i, nums1){
			i++
			a = nums1[i]
		} else if hasNext(j, nums2){
			j++
			a = nums2[j]
		}

	}

	if i+j < 0 {
		b = a
	}

	if isOddLen {
		return float64(b)
	} else {
		return float64(b + a)/2
	}
}

func hasNext(i int, nums []int) bool{
	if i+1 >= len(nums){
		return false
	}
	return true
}


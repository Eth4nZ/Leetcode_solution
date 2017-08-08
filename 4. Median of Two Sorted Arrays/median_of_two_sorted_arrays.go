package ___Median_of_Two_Sorted_Arrays
func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	medianPosition := (len(nums1) + len(nums2))/2
	isOddLen := true
	if (len(nums1) + len(nums2))%2 == 0 {
		isOddLen = false
		medianPosition--
	}
	isI := true
	if len(nums1) == 0 {
		if isOddLen {
			return float64(nums2[medianPosition])
		} else {
			return float64(nums2[medianPosition]+nums2[medianPosition+1])/2
		}
	}
	if len(nums2) == 0 {
		if isOddLen {
			return float64(nums1[medianPosition])
		} else {
			return float64(nums1[medianPosition]+nums1[medianPosition+1])/2
		}
	}

	i := -1
	j := -1
	a := 0
	b := 0

	if len(nums1) != 0 && len(nums2) != 0{
		if nums1[i] > nums2[j] {
			isI = false
			a = nums2[0]
			b = nums2[0]
		} else {
			a = nums2[0]
			b = nums1[0]
		}

	}

	for i+j < medianPosition +1 {
		if isI && i < len(nums1) - 1 {
			i++
		} else {
			j++
		}
		b = a
		if nums1[i] < nums2[j]{
			a = nums1[i]
			isI = true
		} else{
			a = nums2[j]
			isI = false
		}
		println(i, j, a, b)
	}
	if isOddLen {
		return float64(b)
	} else {
		return float64(b + a)/2
	}
}


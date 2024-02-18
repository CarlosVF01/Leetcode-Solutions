package main

import "sort"

func main() {
	minSubsequence([]int{8, 8})
}

func minSubsequence(nums []int) []int {
	if len(nums) == 1 {
		return nums
	}
	maxSequence := 0
	currentSequence := 0
	finalSlice := make([]int, 0, len(nums))
	sort.Ints(nums)

	for i := 0; i < len(nums); i++ {
		maxSequence += nums[i]
	}

	for i := len(nums) - 1; i >= 0; i-- {
		finalSlice = append(finalSlice, nums[i])
		currentSequence += nums[i]
		if currentSequence > (maxSequence - currentSequence) {
			break
		}
	}
	return finalSlice
}

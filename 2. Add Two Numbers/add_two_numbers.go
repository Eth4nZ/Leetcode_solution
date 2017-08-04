package ___Add_Two_Numbers

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

type ListNode struct {
	Val int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	p := &ListNode{0, nil}
	result := p
	for l1 != nil || l2 != nil{
		a := 0
		b := 0
		if l1 != nil { a = l1.Val }
		if l2 != nil { b = l2.Val }
		sum := (a + b)%10
		p.Val += sum
		increment := (a + b)/10
		println("sum: ", sum, ", increment: ", increment)
		q := &ListNode{increment, nil}
		if l1.Next != nil || l2.Next != nil || increment != 0 {
			p.Next = q
			p = p.Next
		}
		l1 = l1.Next
		l2 = l2.Next
	}

	for i := result; i != nil; i = i.Next{
		print(i.Val, " ")
	}
	println()
	return result
}
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
	for l1 != nil || l2 != nil {
		p.Val += l1.Val + l2.Val
		increment := p.Val / 10
		p.Val %= 10
		if l1.Next != nil || l2.Next != nil || increment != 0 {
			p.Next = &ListNode{increment, nil}
			p = p.Next
		}
		l1 = l1.Next
		l2 = l2.Next
		if l1 == nil && l2 != nil {
			l1 = &ListNode{0, nil}
		}
		if l1 != nil && l2 == nil {
			l2 = &ListNode{0, nil}
		}
	}
	return result
}
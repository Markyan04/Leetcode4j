/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    // Simulation
    public ListNode addTwoNumbers_1(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode point = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int a = 0;
            int b = 0;
            int nodeVal = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            nodeVal = sum % 10;

            if (result.next == null && result.val == -1) {
                point.val = nodeVal;
            }
            else {
                point.next = new ListNode(nodeVal);
                point = point.next;
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result;
    }

    // Simulation with Sentinel node
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode previousHead = new ListNode(0);
        ListNode point = previousHead;
        int carry = 0;
        while (l1 != null || l2 != null | carry != 0) {
            int a = 0;
            int b = 0;
            int nodeVal = 0;
            if (l1 != null) {
                a = l1.val;
            }
            if (l2 != null) {
                b = l2.val;
            }

            int sum = a + b + carry;
            carry = sum / 10;
            nodeVal = sum % 10;
            
            point.next = new ListNode(nodeVal);
            point = point.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return previousHead.next;
    }
}
// @lc code=end


package com.laima.leetcode

class Solution21 {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return if (list1 == null && list2 == null) {
            null
        } else if (list1 == null) {
            list2
        } else if (list2 == null) {
            list1
        } else {
            if (list1.`val` <= list2.`val`) {
                val node = ListNode(list1.`val`)
                node.next = mergeTwoLists(list1.next, list2)
                return node
            } else {
                val node = ListNode(list2.`val`)
                node.next = mergeTwoLists(list2.next, list1)
                return node
            }
        }
    }

    inner class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}
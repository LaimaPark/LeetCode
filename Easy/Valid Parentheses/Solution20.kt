package com.laima.leetcode.easy

import java.util.*

class Solution20 {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s.toCharArray()) {
            if (stack.isEmpty())
                stack.push(c)
            else
                when (c) {
                    ')' -> {
                        if (stack.peek() == '(')
                            stack.pop()
                        else
                            stack.push(c)
                    }
                    '}' -> {
                        if (stack.peek() == '{')
                            stack.pop()
                        else
                            stack.push(c)
                    }
                    ']' -> {
                        if (stack.peek() == '[')
                            stack.pop()
                        else
                            stack.push(c)
                    }
                    else -> stack.push(c)
                }
        }

        return stack.isEmpty()
    }
}


/*
       fun isValid(s: String): Boolean {
            var sum = 0
            for (c in s.toCharArray()) {
                when (val intC = c.toInt()) {
                    40 -> sum += (intC + 1)
                    91, 123 -> sum += (intC + 2)
                    else -> sum -= intC
                }
            }
            return sum == 0
        }
 */
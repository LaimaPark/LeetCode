class Solution {
    fun pivotIndex(nums: IntArray): Int {
        
        var sum = 0
        var leftSum = 0
        
        nums.forEach {
            sum += it
        }
        
        nums.forEachIndexed { i, v ->
            if (i > 0) {
                leftSum += nums[i-1]
            }
            sum -= v
            
            if (sum == leftSum) return i
        }
        
        return -1
    }
}

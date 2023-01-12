class Solution {
     fun removeElement(nums: IntArray, `val`: Int): Int {
        var deleteCount = 0
        var front = 0
        var lear = nums.size - 1
        
        for (num in nums) {
            if (num == `val`) {            
                deleteCount++
            }
        }
        
        var count = deleteCount
        while(count > 0 && lear > 0) {
            if (nums[front] != `val`) {
                // 앞 포인터가 지워야할 값이 아닐 때
                front++
            } else {
                if (nums[lear] != `val`) {
                    // 뒷 포인터가 지워야할 값이 아닐 때
                    nums[front] = nums[lear]
                    front++
                    lear--
                    count--
                } else {
                    lear--
                }
                
            }
        }
        
        return nums.size - deleteCount
    }
}
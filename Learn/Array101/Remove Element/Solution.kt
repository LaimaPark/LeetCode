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
                // �� �����Ͱ� �������� ���� �ƴ� ��
                front++
            } else {
                if (nums[lear] != `val`) {
                    // �� �����Ͱ� �������� ���� �ƴ� ��
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
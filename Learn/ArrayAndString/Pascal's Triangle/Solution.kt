class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        
        var result = ArrayList<ArrayList<Int>>()
        
        var tmp = ArrayList<Int>()
        
        for (i in 0 until numRows) {
            var arr = ArrayList<Int>()
            arr.add(1)
            var j = 0
            
            while (j < i) {
                
                if (tmp.size-1 == j) {
                    arr.add(1)
                } else {
                    arr.add(tmp[j] + tmp[j+1])
                }
                j++
            }
            result.add(arr)
            tmp = arr
        }
        return result
    }
}

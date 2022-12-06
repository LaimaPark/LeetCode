package com.laima.leetcode.easy

class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""

        // 배열이 비어있으면 "" return
        if (strs.isNotEmpty()) {
            /*
             배열 중에서 가장 길이가 적은 것을 쓰고 싶었지만
             또 for 문 써야하기 때문에 strs[0] 으로 대체
             */
            val strSample: String = strs[0]

            /* [## 임의로 맨 앞에 말고 확실하게 가장 작은 str 값을 쓰려면? ##]
                val comparator : Comparator<String> = compareBy { it.length }
                val strOrdered = strs.sortedWith(comparator)    // sort : O(nlogn)
                val shortestStr = strOrdered[0]
             */

            for (i in 0..strSample.length) {
                // t , te, tes, test 순으로 올라감
                val test = strSample.substring(0, i)

                /*
                 이 for 문을 통과하면 모든 str에 동일한 prefix
                 */
                for (str in strs)
                    if (!str.startsWith(test))
                        return result

                result = test
            }
        }

        return result
    }
}

// [ Divide and Conquer ]
/*
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
            return longestCommonPrefix(strs, 0 , strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix(strs, l , mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
       }
    }

    String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
 */

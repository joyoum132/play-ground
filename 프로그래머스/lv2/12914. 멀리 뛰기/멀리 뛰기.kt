class Solution {
    fun solution(n: Int): Long {
        val arr = Array(n) {0L}
        var idx = 0
        while(idx < n) {
            when(idx) {
                0 , 1 -> arr[idx] = idx+1L
                else -> arr[idx]= (arr[idx-1]+ arr[idx-2])%1234567
            }
            idx+=1
        }
        return arr[n-1]
    }
}
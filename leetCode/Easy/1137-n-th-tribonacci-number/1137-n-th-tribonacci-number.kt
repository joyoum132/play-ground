class Solution {
    fun tribonacci(n: Int): Int {
        val arr = IntArray(n+1) {0}
        
        for(i in 1..n) {
            when(i) {
                1 -> arr[1] = 1
                2 -> arr[2] = 1
                else -> arr[i] = arr[i-1]+arr[i-2]+arr[i-3]
            }
        }
        return arr[n]
        
    }
}
class Solution {
    fun solution(n: Int): Int {
        val fibo = IntArray(n+1)
        fibo[0] = 0
        fibo[1] = 1
        fibo[2] = 1
        for(i in 3..n) {
            fibo[i] = fibo[i-1]%1234567 + fibo[i-2]%1234567
        }
    return fibo[n]%1234567
    }
}
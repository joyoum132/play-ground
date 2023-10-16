class Solution {
    fun kthFactor(n: Int, k: Int): Int {
        var i = 1
        val factor = mutableSetOf<Int>()
        while(i*i < n) {
            if(n%i == 0) {
                factor += i
                factor += n/i
            }
            i+=1
        }
        if(i*i == n) factor+=i
        return factor.sorted().getOrElse(k-1) {-1}
    }
}
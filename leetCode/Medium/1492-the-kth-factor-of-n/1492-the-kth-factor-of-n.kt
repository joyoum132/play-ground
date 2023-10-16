class Solution {
    fun kthFactor(n: Int, k: Int): Int {
        var cnt = 0
        for(i in 1..n) {
            if(n%i == 0) {
                cnt += 1
            }
            if(cnt == k) return i
        }
        return -1
        // var i = 1
        // var factor = intArrayOf()
        // while(i*i < n) {
        //     if(n%i == 0) {
        //         factor += i
        //         factor += n/i
        //     }
        //     i+=1
        // }
        // if(i*i == n) factor+=i
        // return factor.sorted().getOrElse(k-1) {-1}
    }
}
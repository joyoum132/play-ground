class Solution {
    fun calc(n: Int) : Int {
        var i = 1
        var cnt = 0
        while(i*i < n) {
            if(n%i == 0) {
                cnt+=2
            }
            i+=1
        }
        if(i*i == n) {
            cnt +=1
        }
        return cnt
    }
    
    fun solution(left: Int, right: Int): Int {
        return (left..right)
            .fold(0) { acc , i ->
                val cnt = calc(i)
                acc + (if(cnt % 2 == 0) i else i*(-1))
        }
    }
}
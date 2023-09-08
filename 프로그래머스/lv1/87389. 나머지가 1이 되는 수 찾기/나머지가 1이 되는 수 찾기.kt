class Solution {
    fun solution(n: Int): Int {
        
        var answer = n-1
        for(i in 2 until n-1) {
            if(n%i == 1) {
                answer = i
                break
            }
        }
        return answer
    }
}
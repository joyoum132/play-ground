class Solution {
    fun solution(a: Int, b: Int): Long {
        val range: IntRange = if(a-b<=0) a..b else b..a
        var sum : Long = 0
        for(i in range){
            sum+=i
        }
        return sum
    }
}
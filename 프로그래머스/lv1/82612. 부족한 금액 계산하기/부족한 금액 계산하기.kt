class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        val answer = (count.toLong() * (count+1) * price / 2) - money
        return if(answer > 0) answer else 0
    }
}
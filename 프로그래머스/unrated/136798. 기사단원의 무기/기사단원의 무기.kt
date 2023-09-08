import kotlin.math.sqrt

class Solution {
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        return IntArray(number) {
            if(it == 0) 1
            else getAttack(it+1, limit, power)
        }.sum()
    }
    
    fun getAttack(number: Int, limit: Int, power: Int): Int {
        var cnt = 0
        var i = 1
        while(i * i < number) {
            if(number % i == 0) {
                cnt +=2
            }
            i+=1
        }
        if(i*i == number) cnt+=1

        return if(cnt > limit) power else cnt
    }
}
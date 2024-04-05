class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var x = a.toDouble()
        var y = b.toDouble()
        var res = 0
        
        while(x != y) {
            res+=1
            x = Math.ceil(x / 2)
            y = Math.ceil(y / 2)
        }
        
        return res
    }
}
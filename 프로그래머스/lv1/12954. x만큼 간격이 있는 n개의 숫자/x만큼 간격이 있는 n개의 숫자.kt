class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var v = 0L
        return (1 .. n)
            .map{
                v+=x.toLong()
                v
            
            }.toLongArray()
    }
}
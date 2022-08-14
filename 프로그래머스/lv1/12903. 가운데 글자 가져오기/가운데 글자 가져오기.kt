class Solution {
    fun solution(s: String): String {
        val len = s.length
        val pivot = len/2
        if(len==1 || len == 2) return s
        return if(len%2 == 0) {
            s.substring(pivot-1, pivot+1)
        } else s.substring(pivot, pivot+1)
    }
}
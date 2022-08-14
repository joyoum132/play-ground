class Solution {
    fun solution(s: String): String {
        val len = s.length
        return when(len) {
            1,2 -> s
            else -> s.substring(len/2 - (len-1)%2..len/2 )
        }
    }
}
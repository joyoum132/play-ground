class Solution {
    fun solution(s: String): Boolean {

        val isOnlyNumber = s.toCharArray().count { it.code in 48..57 } == s.length
        val lengthIs = s.length == 4 || s.length == 6
        
        return isOnlyNumber && lengthIs
    }
}
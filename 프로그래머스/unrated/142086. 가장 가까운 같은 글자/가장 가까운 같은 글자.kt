class Solution {
    fun solution(s: String): IntArray {
        return (0 until s.length)
            .map {
                if(it == 0) -1
                else {
            
                    val meBefore = s.substring(0, it)
                    val findIdx = meBefore
                        .toCharArray()
                        .indexOfLast { c-> c == s[it] }
                        
                    if(findIdx == -1) findIdx else it-findIdx
                }
            }.toIntArray()
    }
}
class Solution {
    fun lengthOfLastWord(s: String): Int {
        val sp = s.trim().split(" ")
        return sp.map { it.length }[sp.size-1]
    }
}
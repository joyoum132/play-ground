class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var cnt = 0
        var max = 0
        
        fun checkVowel(c: Char) = when(c) {
            'a', 'e', 'i', 'o', 'u' -> true
            else -> false
        }

        for (i in s.indices) {
            
            if(checkVowel(s[i])) cnt += 1
            if(i >= k && checkVowel(s[i-k])) {
                cnt -= 1
            }
            max = max(cnt, max)
        }
        return max
    }
}
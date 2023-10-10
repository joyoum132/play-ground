class Solution {
    fun reverseVowels(s: String): String {
        var va = charArrayOf()
        if(s.length == 1) return s

        fun isVowel(c: Char): Boolean = when(c) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
            else -> false
        }

        for(c in s) {
            if(isVowel(c)) va += c
            else continue
        }

        va = va.reversedArray()
        val res = StringBuffer()
        var idx = 0
        for(c in s) {
            if(isVowel(c)) {
                res.append(va[idx])
                idx+=1
            } else {
                res.append(c)
            }
        }
        return res.toString()
    }
}
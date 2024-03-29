class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val res = StringBuilder()
        for(i in word1.indices) {
            if(word1.length >= word2.length) {
                res.append(word1[i])
                if(i < word2.length) {
                    res.append(word2[i])
                }
            } else {
                res.append(word1[i]).append(word2[i])
                if(i == word1.length-1) {
                    repeat(word2.length-word1.length) {
                        res.append(word2[i+it+1])
                    }
                }
            }
        }
        return res.toString()
    
    }
}
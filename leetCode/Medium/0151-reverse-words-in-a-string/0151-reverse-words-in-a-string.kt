class Solution {
    fun reverseWords(s: String): String {
        val res = StringBuilder()
        val str = StringBuilder()
        var idx = 0

        while(idx < s.length) {
            while(idx < s.length && s[idx] != ' ') {
                str.append(s[idx])
                idx += 1
            }
            while(idx < s.length && s[idx] == ' ') {
                idx+= 1
            }
            res.insert(0, str.append(" ").toString())
            str.clear()
        }
        return res.toString().trim()
        
    }
}
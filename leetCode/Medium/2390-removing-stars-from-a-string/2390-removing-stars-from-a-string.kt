class Solution {
    fun removeStars(s: String): String {
        val st = Stack<Char>()
        for(c in s) {
            if(c == '*') st.pop()
            else st.push(c)
        }
        
        var ans = ""
        while(st.isNotEmpty()) {
            ans = st.pop()+ans
        }
        return ans
    }
}
class Solution {
    fun decodeString(s: String): String {
        val cntStack = Stack<Int>()
        val strStack = Stack<String>()
        var str = ""
        var cnt = ""
        
        for(c in s) {
            when(c.code) {
                in 48..57 -> {
                    cnt += c.toString()
                }
                91 -> {
                    cntStack.push(cnt.toInt())
                    strStack.push(str)
                    
                    cnt = ""
                    str = ""
                }
                93 -> {
                    str = strStack.pop() + str.repeat(cntStack.pop())
                } 
                else -> {
                    str += c.toString()
                }
            }
        }
        return str
    }
}
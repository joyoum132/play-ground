class Solution {
    fun decodeString(s: String): String {
        val cntStack = Stack<Int>()
        val strStack = Stack<String>()
        var str = StringBuilder()
        var cnt = StringBuilder()
        for(c in s) {
            when(c.code) {
                in 48..57 -> {
                    cnt.append(c.toString())
                }
                91 -> {
                    strStack.push(str.toString())
                    cntStack.push(cnt.toString().toInt())
                    str = StringBuilder()
                    cnt = StringBuilder()
                }
                93 -> {

                    str =  StringBuilder(strStack.pop() + str.repeat(cntStack.pop()))
                }
                else -> {
                    str.append(c.toString())
                }
            }
        }

        return str.toString()
    }
}
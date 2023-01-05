class Solution {
    fun solution(s: String): Int {
        var resCnt = 0
        
        fun parseStr(input: String) {
            var same = 0
            var notSame = 0
            var curIdx = 0
            val ca = input.toCharArray()
            for (i in ca.indices) {
                if(input.first() == ca[i]) same++ else notSame++
                if(same == notSame) {
                    resCnt++
                    curIdx = i
                    break
                }
                if(same != notSame && i == input.lastIndex) {
                    resCnt++
                    return
                }
            }
            if(curIdx == ca.lastIndex) {
                return
            } else {
                parseStr(input.substring(curIdx+1))
            }
        }
        
        parseStr(s)
        return resCnt
    }
}
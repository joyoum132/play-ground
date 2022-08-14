class Solution {
    fun solution(seoul: Array<String>): String {
        var idx = 0
        seoul.forEachIndexed { index, s ->
            if(s=="Kim") {
                idx = index
                return@forEachIndexed
            }
        }
    return "김서방은 "+idx+"에 있다"
    }
}
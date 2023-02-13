class Solution {
    fun solution(s: String): String {
    var index = 0
    var answer = ""
    for (c in s) {
        if(c == ' ') {
            index = 0
            answer+= c
            continue
        }
        if(index%2==0) answer+= c.uppercase()
        else answer+= c.lowercase()
        index += 1
    }
    return answer
}
}
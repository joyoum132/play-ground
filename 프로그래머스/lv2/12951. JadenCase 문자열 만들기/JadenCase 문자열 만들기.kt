class Solution {
    fun solution(s: String): String {
        var idx = -1
        return s.fold("") {acc, c -> 
            idx+=1
            if(c.code == 32) {
                idx = -1
                acc + " "
            } else if(idx == 0) {
                acc + c.uppercase()
            } else {
                acc + c.lowercase()
            }
        }
    }
}
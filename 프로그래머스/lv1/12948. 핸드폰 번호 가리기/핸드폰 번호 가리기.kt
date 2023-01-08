class Solution {
    fun solution(phone_number: String): String {
        val len = phone_number.length
        if(len == 4) return phone_number

        var answer = ""
        phone_number.forEachIndexed { index, c ->
            answer += if(index < len-4) "*"
            else c.toString()
        }
        return answer
    }
}
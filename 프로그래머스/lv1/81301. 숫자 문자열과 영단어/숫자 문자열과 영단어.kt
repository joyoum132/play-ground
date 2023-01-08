class Solution {
    fun solution(s: String): Int {
        fun strToInt(input: String) : String? {
            return when(input) {
                "zero" -> "0"
                "one" -> "1"
                "two" -> "2"
                "three" -> "3"
                "four" -> "4"
                "five" -> "5"
                "six" -> "6"
                "seven" -> "7"
                "eight" -> "8"
                "nine" -> "9"
                else -> null
            }
        }

        var resStr = ""
        var input = ""
        s.toCharArray().forEach {
            if(it.code in 48..57) {
                resStr += it.toString()
            } else {
                input+= it.toString()
                strToInt(input)?.let { int ->
                    resStr += int
                    input = ""
                }
            }
        }
        return resStr.toInt()
    }
}
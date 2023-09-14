class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        var temp = hashMapOf<Char, Array<String>>()
        for(s in strings) {
            temp[s[n]] = if(temp.containsKey(s[n])) {
                temp[s[n]]!! + s
            } else {
                arrayOf(s)
            }
        }

        for(c in temp.keys.sorted()) {
            answer += temp[c]!!.sortedArray()
        }

        return answer
    }
}
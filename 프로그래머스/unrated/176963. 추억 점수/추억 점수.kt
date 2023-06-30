class Solution {
fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    var answer: IntArray = IntArray(photo.size)

    photo.forEachIndexed { px, strings ->
        answer[px] = strings.mapIndexed { index, s ->
            val k = name.indexOf(s)
            if(k >= 0) yearning[k] else 0
        }.sum()
    }
    return answer
}
}
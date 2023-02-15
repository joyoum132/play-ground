class Solution {
    fun solution(food: IntArray): String {
        var answer = ""
        (1 until food.size).forEach { f ->
            repeat(food[f] / 2) { answer += f}
        }

    return answer + "0" + answer.reversed()
    }
}
class Solution {
    fun solution(answers: IntArray): IntArray {
        val s1Seq = intArrayOf(1, 2, 3, 4, 5)
        val s2Seq = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val s3Seq = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        val isCorrect : MutableMap<Int, Int> = mutableMapOf(1 to 0, 2 to 0, 3 to 0)

    for (i in answers.indices) {
        val answer = answers[i]
        if(s1Seq[i%(s1Seq.size)] == answer) {
            isCorrect[1] = isCorrect[1]!! + 1
        }
        if(s2Seq[i%(s2Seq.size)] == answer) {
            isCorrect[2] = isCorrect[2]!! + 1
        }
        if(s3Seq[i%(s3Seq.size)] == answer) {
            isCorrect[3] = isCorrect[3]!! + 1
        }
    }


    val maxCnt = isCorrect.maxOf { it.value }
    val answer = mutableListOf<Int>()
    isCorrect.forEach { if(it.value == maxCnt) answer.add(it.key) }
    return answer.toIntArray()
    }
}
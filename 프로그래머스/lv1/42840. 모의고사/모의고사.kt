class Solution {
    fun solution(answers: IntArray): IntArray {
        val s1Seq = intArrayOf(1, 2, 3, 4, 5)
        val s2Seq = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val s3Seq = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var s1 = Array(answers.size) { 0 }
        var s2 = Array(answers.size) { 0 }
        var s3 = Array(answers.size) { 0 }
        //answers 만큼 수포자들의 intArray 를 새로 만들었는데, 그렇게 하지 않고 뱌로 정답 여부를 체크해서 count 하면 더 좋았을 것 같다.
        for (i in answers.indices) {
            s1[i] = s1Seq[i%(s1Seq.size)]
            s2[i] = s2Seq[i%(s2Seq.size)]
            s3[i] = s3Seq[i%(s3Seq.size)]
        }

        val matched = intArrayOf(
            s1.filterIndexed { index, i ->  answers[index] == i}.size,
            s2.filterIndexed { index, i ->  answers[index] == i}.size,
            s3.filterIndexed { index, i ->  answers[index] == i}.size
        )
        val maxCnt = matched.maxOf { it }
        val answer = mutableListOf<Int>()
        matched.forEachIndexed { index, i ->  if(i == maxCnt) {answer.add(index+1)} }

        return answer.toIntArray()
    }
}

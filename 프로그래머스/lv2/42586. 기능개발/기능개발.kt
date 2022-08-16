class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val len = progresses.size
        if(len == 0) return intArrayOf(0)
        if(len == 1) return intArrayOf(1)

        var count = 1
        var date = 0
        val res = mutableListOf<Int>()
        progresses
            .mapIndexed { index, i ->
            // 기능별 남은 작업일을 구한다.
            if((100-i)%speeds[index] == 0 ) (100-i)/speeds[index]
            else (100-i)/speeds[index]+1
            }.forEachIndexed { index, i ->
                if(index == 0) {
                    date = i
                } else {
                    if(date < i) {
                        res.add(count)
                        count = 1
                        date = i
                    } else {
                        count +=1
                    }

                    if(index == progresses.size-1) res.add(count)
                }
            }
        return res.toIntArray()
    }
}
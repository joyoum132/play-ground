import java.util.*

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val len = progresses.size
        if(len == 0) return intArrayOf(0)
        if(len == 1) return intArrayOf(1)

        val q: Queue<Int> = LinkedList()
        val res = mutableListOf<Int>()
        progresses
            .mapIndexed { index, i ->
                // 기능별 남은 작업일을 구한다.
                if((100-i)%speeds[index] == 0 ) (100-i)/speeds[index]
                else (100-i)/speeds[index]+1
            }
            .forEachIndexed{ index, it ->
                if(q.isNotEmpty() && q.peek() < it) {
                    res.add(q.size)
                    q.clear()
                }
                q.offer(it)
                if(index == progresses.size-1) res.add(q.size)
            }
        return res.toIntArray()
    }
}
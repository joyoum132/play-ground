class Solution {
    fun solution(elements: IntArray): Int {
        val res = elements.toHashSet()
        repeat(elements.size-1) {
            (elements + elements.take(it+1)).toList().windowed(it+2) { arr ->
                res.add(arr.sum())
            }
        }
        
        return res.size
    }
}
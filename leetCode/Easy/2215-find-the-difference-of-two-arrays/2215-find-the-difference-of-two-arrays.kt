class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        // val s1 = nums1.toSet()
        // val s2 = nums2.toSet()

        // return listOf(s1.subtract(s2).toList(), s2.subtract(s1).toList())
        
        val s1 = HashSet<Int>()
        val s2 = HashSet<Int>()
        nums1.forEach { s1.add(it) }
        nums2.forEach { s2.add(it) }

        return listOf(
            s1.filterNot { s2.contains(it) },
            s2.filterNot { s1.contains(it) }
        )
    }
}
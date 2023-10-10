class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var cnt = n
        var prev = 0
        for(i in 0 until flowerbed.size-1) {
            if(flowerbed[i] == 0) {
                if(prev == 0 && flowerbed[i+1] == 0) {
                    cnt -= 1
                    prev = 1
                } else {
                    prev = 0
                }
            } else {
                prev = 1
            }
            if(cnt == 0) return true
        }

        return if(cnt > 1) false
        else if(cnt == 0) return true
        else prev == 0 && flowerbed[flowerbed.size-1] == 0
    }
}
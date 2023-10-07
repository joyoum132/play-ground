class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val s = Stack<Int>()
        for(a in asteroids) {
            if(a > 0 || s.isEmpty() || s.peek() < 0) {
                s.push(a)
                continue
            }
            var needPush = false
            while(s.isNotEmpty() && s.peek() > 0 && a < 0) {
                val diff = s.peek() + a
                when {
                    diff < 0 -> {
                        s.pop()
                        needPush = true
                    }
                    diff == 0 -> {
                        s.pop()
                        needPush = false
                        break
                    }
                    diff > 0 -> {
                        needPush = false
                        break
                    }
                }
            }
            if(needPush) {
                s.push(a)
            }
        }
        return s.toIntArray()
    }
}
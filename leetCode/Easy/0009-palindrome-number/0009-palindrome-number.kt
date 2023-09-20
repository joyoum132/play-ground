class Solution {
    fun isPalindrome(x: Int): Boolean {
        val input = String.format("%d", x)
        if(input[0] == '-') return false
        
        for(i in 0..input.length/2) {
            if(input[i] != input[input.length-1-i]) {
                return false
            }
        }
        return true
    }
}
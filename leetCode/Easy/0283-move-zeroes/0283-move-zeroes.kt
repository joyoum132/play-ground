class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        if(nums.size == 1) return

        var z = 0
        var n = 0
        
        while(z < nums.size && n < nums.size) {
            //find zero
            while(z < nums.size && nums[z] != 0) {
                z+=1
            }
            
            //find number
            while(n < nums.size && nums[n] == 0) {
                n+=1
            }
            
            if(z >= nums.size || n >= nums.size) return

            if(z < n) {
                switching(nums, z, n)
                z+=1
                n+=1
            } else {
                n+=1    
            }
        }
    }
    
    fun switching(nums: IntArray, zero: Int, number: Int) {
        val temp = nums[zero]
        nums[zero] = nums[number]
        nums[number] = temp
    }
}
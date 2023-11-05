class Solution {
    public int rob(int[] nums) {
        int m = 0;
        if(nums.length == 1) {return nums[0];}
        else if(nums.length == 2) return Math.max(nums[0], nums[1]);
        else {
            int bBefore = nums[0];
            int before = Math.max(nums[1],nums[0]);
            for(int i=2; i<nums.length; i++) {
                m = Math.max(before, bBefore+nums[i]);
                bBefore = before;
                before = m;
            }
        }
        return m;
    }
}